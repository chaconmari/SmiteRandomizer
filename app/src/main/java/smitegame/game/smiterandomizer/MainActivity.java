package smitegame.game.smiterandomizer;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.smiterandomizer.R;

public class MainActivity extends AppCompatActivity {

    DBHandler myDB;
    private ListView obj;
    private ImageButton solo,mid,carry,jungle,support, random;
    private TextView test;
    private WebView webView;
    private WebSettings webSettings;
    private String god;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar_layout);

        solo = (ImageButton)findViewById(R.id.soloButton);
        mid = (ImageButton)findViewById(R.id.midButton);
        carry = (ImageButton)findViewById(R.id.carryButton);
        jungle = (ImageButton)findViewById(R.id.jungleButton);
        support = (ImageButton) findViewById(R.id.supportButton);
        random = (ImageButton) findViewById(R.id.randomButton);
        webView = findViewById(R.id.smiteWeb);
        myDB = new DBHandler(this);
        god = null;
        webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("https://smitesource.com/");

        solo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                god = myDB.getGod(1);
                webView.loadUrl("https://smitesource.com/gods/" + god);
            }
        });

        mid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                god = myDB.getGod(3);
                webView.loadUrl("https://smitesource.com/gods/" + god);
            }
        });

        carry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                god = myDB.getGod(5);
                webView.loadUrl("https://smitesource.com/gods/" + god);
            }
        });

        jungle.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                god = myDB.getGod(2);
                webView.loadUrl("https://smitesource.com/gods/" + god);
            }
        }));

        support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                god = myDB.getGod(4);
                webView.loadUrl("https://smitesource.com/gods/" + god);
            }
        });

        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                god = myDB.getAllGods();
                webView.loadUrl("https://smitesource.com/gods/" + god);
            }
        });
    }
}