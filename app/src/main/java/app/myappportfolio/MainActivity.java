package app.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //((Button)findViewById(R.id.popularMoviesButton)).setOnClickListener(this);
        //((Button)findViewById(R.id.stockHawkButton)).setOnClickListener(this);

        ViewGroup parentView = (ViewGroup) findViewById(R.id.mainLayout);

        for(View view : parentView.getTouchables()) {
            if (view instanceof Button) {

                Button b = (Button) view;

                b.setOnClickListener(this);
            }
        }

    }

    @Override
    public void onClick(View view) {

        //if (view instanceof Button) {
            Button b = (Button) view;

            toastMessage(getString(R.string.willRun)+": "+b.getText());
       // }

    }

    public void toastMessage(CharSequence text) {

        Context context = getApplicationContext();

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context,text,duration);
        toast.show();

    }

}
