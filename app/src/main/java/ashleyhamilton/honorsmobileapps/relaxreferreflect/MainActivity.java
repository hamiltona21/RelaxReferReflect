package ashleyhamilton.honorsmobileapps.relaxreferreflect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private String[] quotes={"Act as if what you do makes a difference. It does. - William James","Success is not final, failure is not fatal: it is the courage to continue that counts. - Winston Churchill","Never bend your head. Always hold it high. Look the world straight in the eye. - Helen Keller","What you get by achieving your goals is not as important as what you become by achieving your goals. - Zig Ziglar","Believe you can and you're halfway there. - Theodore Roosevelt","When you have a dream, you've got to grab it and never let go. - Carol Burnett","I can't change the direction of the wind, but I can adjust my sails to always reach my destination. - Jimmy Dean","No matter what you're going through, there's a light at the end of the tunnel. - Demi Lovato","It is our attitude at the beginning of a difficult task which, more than anything else, will affect its successful outcome. - William James","Life is like riding a bicycle. To keep your balance, you must keep moving. - Albert Einstein"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView quote=findViewById(R.id.quoteSpot);
        String toSet=quotes[(int)(10*Math.random())];
        quote.setText(toSet);
        Button relax=findViewById(R.id.relax);
        Button refer=findViewById(R.id.refer);
        Button reflect=findViewById(R.id.reflect);
        View.OnClickListener myListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId() == R.id.relax) {
                    Intent intent = new Intent(MainActivity.this, RelaxActivity.class);
                    startActivity(intent);
                }
                else if(v.getId() == R.id.refer) {
                    Intent intent = new Intent(MainActivity.this, ReferActivity.class);
                    startActivity(intent);
                }
                else if(v.getId() == R.id.reflect) {
                    Intent intent = new Intent(MainActivity.this, ReflectActivity.class);
                    startActivity(intent);
                }
            }
        };
        refer.setOnClickListener(myListener);
        reflect.setOnClickListener(myListener);
        relax.setOnClickListener(myListener);




    }
}
