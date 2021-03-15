package to.msn.wings.forequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] QUIZ = {"ジョナサン", "ジョセフ", "承太郎", "仗助"};
    int tap = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //選択肢のシャッフル
        List<String> list = Arrays.asList(QUIZ.clone());
        Collections.shuffle(list);
        ((Button)findViewById(R.id.b0)).setText(list.get(0));
        ((Button)findViewById(R.id.b1)).setText(list.get(1));
        ((Button)findViewById(R.id.b2)).setText(list.get(2));
        ((Button)findViewById(R.id.b3)).setText(list.get(3));
    }

    public void onButton(View v){
        String text = ((Button)v).getText().toString();

        //正解
        if(text.equals(QUIZ[tap])){
            v.setEnabled(false);
            tap++;
            ((TextView)findViewById(R.id.tv)).setText( tap+"問正解！！");
        //全問正解
            if(tap >= 4){
                ((TextView)findViewById(R.id.tv)).setText("ゲームクリア");
            }

        } else {
            ((TextView)findViewById(R.id.tv)).setText("ゲームオーバー");
            ((Button)findViewById(R.id.b0)).setEnabled(false);
            ((Button)findViewById(R.id.b1)).setEnabled(false);
            ((Button)findViewById(R.id.b2)).setEnabled(false);
            ((Button)findViewById(R.id.b3)).setEnabled(false);
        }
    }

}