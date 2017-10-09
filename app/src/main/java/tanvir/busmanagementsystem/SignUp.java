package tanvir.busmanagementsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void startSignInPage(View view) {

        Intent myIntent = new Intent(SignUp.this, SignIn.class);
        myIntent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        SignUp.this.startActivity(myIntent);
        overridePendingTransition(R.anim.left_in,R.anim.left_out);
        finish();

    }

    public void onBackPressed()
    {
        super.onBackPressed();

        Intent myIntent = new Intent(SignUp.this, MainActivity.class);
        myIntent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        SignUp.this.startActivity(myIntent);
        overridePendingTransition(R.anim.right_in,R.anim.right_out);
        finish();

    }


}
