package ashleyhamilton.honorsmobileapps.relaxreferreflect;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

public class ReflectActivity extends AppCompatActivity {
    EditText journal;
    TextView showDate;
    int textSize;
    int textColor;
    int textStyle;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reflect);
        textSize=26;
        textColor=0;
        textStyle=0;
        Toolbar myToolbar=(Toolbar)findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        Button help=findViewById(R.id.help_reflect);
        journal=findViewById(R.id.editText);
        Button clear=findViewById(R.id.clear);
        Button pickDate=findViewById(R.id.date);
        showDate=findViewById(R.id.showDate);
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
                else if(v.getId() == R.id.clear) {
                    journal.setText("");
                    textColor=0;
                    textSize=0;
                    textStyle=0;
                    showDate.setText("");
                }
                else if(v.getId() == R.id.date) {
                    showDatePickerDialog(v);

                }

            }
        };
        help.setOnClickListener(myListener);
        clear.setOnClickListener(myListener);
        pickDate.setOnClickListener(myListener);
    }
    public void showDatePickerDialog(View v){
        DialogFragment newFragment=new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");

    }
    public void processDatePickerResult(int year, int month, int day){
        String sDay=Integer.toString(day);
        String sMonth=Integer.toString(month);
        String sYear=Integer.toString(year);
        String dateMessage=(sMonth+"/"+sDay+"/"+sYear);
        showDate.setText(dateMessage);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.textsize:
                if(textSize==26){
                    journal.setTextSize(14);
                    textSize=14;
                }
                else{
                    journal.setTextSize(journal.getTextSize()+1);
                    textSize=26;
                }

                return true;

            case R.id.textColor:
                if(textColor==3){
                    textColor=0;
                    journal.setTextColor(Color.BLACK);
                }
                else if(textColor==0){
                    textColor++;
                    journal.setTextColor(Color.RED);
                }
                else if(textColor==1){
                    textColor++;
                    journal.setTextColor(Color.BLUE);
                }
                else if(textColor==2){
                    textColor++;
                    journal.setTextColor(Color.WHITE);
                }

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.actionbar,menu);
        return true;
    }

}
