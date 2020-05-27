package ashleyhamilton.honorsmobileapps.relaxreferreflect;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ReflectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reflect);
        Button help=findViewById(R.id.help_reflect);
        View.OnClickListener myListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId() == R.id.help_reflect) {
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(ReflectActivity.this);
                    alertDialogBuilder.setMessage("FEATURE COMING SOON: Write out your feelings in the lines below! Press the Clear button to delete your work. Customize your journal with the picking options on the top of the screen.");
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
        help.setOnClickListener(myListener);
    }
}
