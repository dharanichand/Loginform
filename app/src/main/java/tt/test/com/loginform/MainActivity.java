package tt.test.com.loginform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

      public void clickFunction(View view) {
          //Toast.makeText(MainActivity.this,"Hi how are u",Toast.LENGTH_LONG).show();
          EditText editText1 = (EditText) findViewById(R.id.editText1);
          EditText editText2 = (EditText)  findViewById(R.id.editText2);
          Log.i("Username",editText1.getText().toString());
          Log.i("Password",editText2.getText().toString());
          Toast.makeText(MainActivity.this,editText1.getText().toString()+ editText2.getText().toString() ,Toast.LENGTH_LONG).show();
      }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
