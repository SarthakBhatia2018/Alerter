package sarthak.bhatia.alerter;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.tapadoo.alerter.Alerter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showAlert(View v) {
        Alerter.create(this)
                .setTitle("Alert Title")
                .setText("Warning!You need admin access to do that")
                .setDuration(4000)
                .enableProgress(true)
                .enableSwipeToDismiss()
                .setProgressColorRes(R.color.colorAccent)
                .setBackgroundColorRes(R.color.alertcolor)
                .setIcon(R.drawable.ic_alert)
                .show();
    }
}
