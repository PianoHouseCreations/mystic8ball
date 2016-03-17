package pianohousecreations.mystic8ball;

// standard java import stuff
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

// this is the main activity for the single class in this app
public class MainActivity extends AppCompatActivity {

    // making an int array to hold the available images for answers
    int[] images = new int[] {
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
    }

    // method to set all the things when the button is pressed
    public void getAnswerButtonPressed(View view) {
        // create imageView object
        ImageView imageView = (ImageView) findViewById(R.id.ballPicture);

        // set the ImageView to show the answer
        imageView.setImageResource(images[getRandomImageId()]);
    }

    // method to return random image
    public int getRandomImageId () {
        // Get a random between 0 and images.length-1
        int imageId = (int)(Math.random() * images.length);
        return imageId;
    }


}
