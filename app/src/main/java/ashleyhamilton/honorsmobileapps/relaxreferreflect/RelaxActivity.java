package ashleyhamilton.honorsmobileapps.relaxreferreflect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class RelaxActivity extends AppCompatActivity {
    MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relax);
        ImageButton frequency=findViewById(R.id.frequency);
        ImageButton jazz=findViewById(R.id.jazz);
        ImageButton meditation=findViewById(R.id.meditation);
        ImageButton mozart=findViewById(R.id.mozart);
        ImageButton nature=findViewById(R.id.nature);
        ImageButton ocean=findViewById(R.id.ocean);
        ImageButton upbeat=findViewById(R.id.upbeat);
        ImageButton vacuum=findViewById(R.id.vacuum);
        Button stop=findViewById(R.id.stop);
        Button help=findViewById(R.id.help);
        View.OnClickListener myListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mMediaPlayer!=null){
                    mMediaPlayer.release();
                    mMediaPlayer=null;
                }
                if(v.getId() == R.id.frequency) {
                    mMediaPlayer=MediaPlayer.create(RelaxActivity.this, R.raw.frequency);
                    mMediaPlayer.start();
                }
                else if(v.getId() == R.id.jazz) {
                    mMediaPlayer=MediaPlayer.create(RelaxActivity.this, R.raw.jazz);
                    mMediaPlayer.start();
                }
                else if(v.getId() == R.id.meditation) {
                    mMediaPlayer=MediaPlayer.create(RelaxActivity.this, R.raw.meditation);
                    mMediaPlayer.start();
                }
                else if(v.getId() == R.id.mozart) {
                    mMediaPlayer=MediaPlayer.create(RelaxActivity.this, R.raw.mozart);
                    mMediaPlayer.start();
                }
                else if(v.getId() == R.id.nature) {
                    mMediaPlayer=MediaPlayer.create(RelaxActivity.this, R.raw.nature);
                    mMediaPlayer.start();
                }
                else if(v.getId() == R.id.ocean) {
                    mMediaPlayer=MediaPlayer.create(RelaxActivity.this, R.raw.ocean);
                    mMediaPlayer.start();
                }
                else if(v.getId() == R.id.upbeat) {
                    mMediaPlayer=MediaPlayer.create(RelaxActivity.this, R.raw.upbeat);
                    mMediaPlayer.start();
                }
                else if(v.getId() == R.id.vacuum) {
                    mMediaPlayer=MediaPlayer.create(RelaxActivity.this, R.raw.vacuum);
                    mMediaPlayer.start();
                }
                else if(v.getId() == R.id.help) {
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(RelaxActivity.this);
                    alertDialogBuilder.setMessage("This screen is a satisfying sound board. Select an image to play a tune. From there, you can select another image to stop the previous sound and start to play a new one. Press \"stop all\" to stop the music.");
                            alertDialogBuilder.setPositiveButton("OK",
                                    new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface arg0, int arg1) {

                                        }
                                    });
                    AlertDialog alertDialog = alertDialogBuilder.create();
                    alertDialog.show();
                }

            }
        };
        frequency.setOnClickListener(myListener);
        jazz.setOnClickListener(myListener);
        meditation.setOnClickListener(myListener);
        mozart.setOnClickListener(myListener);
        nature.setOnClickListener(myListener);
        ocean.setOnClickListener(myListener);
        upbeat.setOnClickListener(myListener);
        vacuum.setOnClickListener(myListener);
        stop.setOnClickListener(myListener);
        help.setOnClickListener(myListener);
    }
    @Override
    protected void onStop(){
        super.onStop();
        if(mMediaPlayer!=null){
            mMediaPlayer.release();
            mMediaPlayer=null;
        }
    }

}
