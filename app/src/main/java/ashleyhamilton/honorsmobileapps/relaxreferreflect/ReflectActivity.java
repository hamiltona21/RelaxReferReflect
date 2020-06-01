package ashleyhamilton.honorsmobileapps.relaxreferreflect;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ReflectActivity extends AppCompatActivity {
    EditText journal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reflect);
        Button help=findViewById(R.id.help_reflect);
        journal=findViewById(R.id.editText);
        Button clear=findViewById(R.id.clear);
        View.OnClickListener myListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId() == R.id.help_reflect) {
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(ReflectActivity.this);
                    alertDialogBuilder.setMessage("Write out your feelings in the lines below! Press the Clear button to delete your work. Customize your journal with the picking options on the top of the screen and by picking a date to further embellish your mood reflection journal.");
                    alertDialogBuilder.setPositiveButton("OK",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface arg0, int arg1) {

                                }
                            });
                    AlertDialog alertDialog = alertDialogBuilder.create();
                    alertDialog.show();
                }
                if(v.getId() == R.id.clear) {
                    journal.setText("");
                }

            }
        };
        help.setOnClickListener(myListener);
        clear.setOnClickListener(myListener);
    }
}
