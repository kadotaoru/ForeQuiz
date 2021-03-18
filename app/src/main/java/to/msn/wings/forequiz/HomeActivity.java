package to.msn.wings.forequiz;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private Button lvBtn1;
    private Button lvBtn2;
    private Button lvBtn3;
    private Button lvBtn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    //全ステータスバーを非表示にしてフルスクリーン化
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            hideSystemUI();
        }
    }

    private void hideSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        );

        decorView.setOnSystemUiVisibilityChangeListener
                (new View.OnSystemUiVisibilityChangeListener() {
                    @Override
                    public void onSystemUiVisibilityChange(int visibility) {
                        // Note that system bars will only be "visible" if none of the
                        // LOW_PROFILE, HIDE_NAVIGATION, or FULLSCREEN flags are set.
                        if ((visibility & View.SYSTEM_UI_FLAG_FULLSCREEN) == 0) {
                            Log.d("debug","The system bars are visible");
                        } else {
                            Log.d("debug","The system bars are NOT visible");
                        }
                    }
                });
    }

    public void onLv1(View v){
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
        finish();
    }

    public void onLv2(View v){
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
        finish();
    }

    public void onLv3(View v){
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
        finish();
    }

    public void onLv4(View v){
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
        finish();
    }
}
