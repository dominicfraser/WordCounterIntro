package example.codeclan.com.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LaunchActivity extends AppCompatActivity {

    private EditText enteredWords;
    private TextView count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        Log.d(getClass().toString(), "Lauching");

        enteredWords = (EditText) findViewById(R.id.enter_all_text);
        count = (TextView) findViewById(R.id.amount_of_words);

//        enteredWords.addTextChangedListener(textWatcher);

    }


    public void onWordsEntered(View text){
        Log.d(getClass().toString(), "show count button pressed");

        String words = enteredWords.getText().toString();

        Word all_words = new Word(words);

        String countOfWords = String.valueOf(all_words.amountOfWords());

        count.setText(countOfWords);
    }

    //    private TextWatcher textWatcher = new TextWatcher() {
//        @Override
//        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//        }
//
//        @Override
//        public void onTextChanged(CharSequence s, int start, int before, int count) {
//        String words = enteredWords.getText().toString();
//        Word all_words = new Word(words);
//        int count_of_words = all_words.amountOfWords();
//        count.setText(count_of_words);
//        }
//
//        @Override
//        public void afterTextChanged(Editable s) {
//
//        }
//    }
}
