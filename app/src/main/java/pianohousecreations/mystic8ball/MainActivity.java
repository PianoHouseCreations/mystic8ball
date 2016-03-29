package pianohousecreations.mystic8ball;

// standard java import stuff

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// this is the main activity for the single class in this app
//public class MainActivity extends AppCompatActivity implements SensorEventListener {
public class MainActivity extends AppCompatActivity {

    private SensorManager senSensorManager;
    private Sensor senAccelerometer;

    // making an int array to hold the available images for answers
    private int[] images = new int[] {
            R.drawable.cloudy,
            R.drawable.countonit,
            R.drawable.doubtit,
            R.drawable.forsure,
            R.drawable.maybe,
            R.drawable.no,
            R.drawable.nope,
            R.drawable.ohyeah,
            R.drawable.perhaps,
            R.drawable.really,
            R.drawable.secret,
            R.drawable.tellyalater,
            R.drawable.wontunderstand,
            R.drawable.yes,
            R.drawable.yup};

    // code to display this activity on the screen
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        senSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
//        senAccelerometer = senSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
//        senSensorManager.registerListener(this, senAccelerometer, SensorManager.SENSOR_DELAY_NORMAL);

    }

    // method to set all the things when the button is pressed
    public void getAnswerPicturePressed(View view) {
        // create imageView object
        ImageView imageView = (ImageView) findViewById(R.id.ballPicture);

        // set the ImageView to show the answer
        imageView.setImageResource(images[getRandomIndex()]);
    }

    // method to return random index of an image
    private int getRandomIndex() {
        // Get a random number between 0 and images.length-1
        return (int)(Math.random() * images.length);
    }



    @Override
    protected void onPostResume() {
        super.onPostResume();
        TextView textView = (TextView) findViewById(R.id.directions);
        textView.setTextColor(getResources().getColor(android.R.color.holo_green_light));
    }
    //    @Override
//    public void onSensorChanged(SensorEvent event) {
//        Toast toast = Toast.makeText(this, "Movement detected", Toast.LENGTH_SHORT);
//        toast.show();
//    }
//
//    @Override
//    public void onAccuracyChanged(Sensor sensor, int accuracy) {
//    }
//
//    protected void onPause() {
//        super.onPause();
//        senSensorManager.unregisterListener(this);
//    }

//    protected void onResume() {
//        super.onResume();
//        senSensorManager.registerListener(this, senSensorManager.SENSOR_DELAY_NORMAL);
//    }
}
