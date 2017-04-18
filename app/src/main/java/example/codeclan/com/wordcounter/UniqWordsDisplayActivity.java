package example.codeclan.com.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class UniqWordsDisplayActivity extends AppCompatActivity {

    private TextView uniq_words;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uniq_words_display);

        Log.d(getClass().toString(), "onCreate called for UniqWordsDisplay");

        uniq_words = (TextView) findViewById(R.id.uniq_words_count);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String words = extras.getString("words");

        //replace with logic to create a new thing here
        uniq_words.setText(words);
        

    }
}
