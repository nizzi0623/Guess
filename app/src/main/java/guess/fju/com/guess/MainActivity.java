package guess.fju.com.guess;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void guess (View view){
        Log.d("Main Activity", "guessing number");
        int random;
        random = (int)(Math.random()*10)+1;
        EditText edNum = (EditText) findViewById(R.id.ed_num);
        int num = Integer.parseInt(edNum.getText().toString());
        if (num == random){
            new AlertDialog.Builder(this).setMessage("Yes! The number  is " + random)
                    .setPositiveButton("OK", null)
                    .show();
        }else{

        }



    }
}
