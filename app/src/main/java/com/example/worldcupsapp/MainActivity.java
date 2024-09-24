package com.example.worldcupsapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    ListView listView;
    ArrayList<String> names;
    TextView textView2;
    ImageView iP;
    public String pU1930 = "Host Nation (Year): Uruguay (1930)\nWinner: Uruguay\nGolden Boot Winner (Nationality): Stabile Guillermo (Argentina)\nGoals (Penalties): 8 (0)\nFinal Venue (Attendance): Estadio Centenario (68,346)";
    public String pS1958 = "Host Nation (Year): Sweden (1958)\nWinner: Brazil\nGolden Boot Winner (Nationality): Just Fontaine (France)\nGoals (Penalties): 13 (0)\nFinal Venue (Attendance): Råsunda Stadium (49,737)";
    public String pC1962 = "Host Nation (Year): Chile (1962)\nWinner: Brazil\nGolden Boot Winner (Nationality): Garrincha (Brazil)\nGoals (Penalties): 4 (0)\nFinal Venue (Attendance): Estadio Nacional (68,679)";
    public String pM1970 = "Host Nation (Year): Mexico (1970)\nWinner: Brazil\nGolden Boot Winner (Nationality): Gerd Muller (West Germany)\nGoals (Penalties): 10 (1)\nFinal Venue (Attendance): Aztec Stadium (107,412)";
    public String pM1986 = "Host Nation (Year): Mexico (1986)\nWinner: Argentina\nGolden Boot Winner (Nationality): Gary Lineker (England)\nGoals (Penalties): 6 (0)\nFinal Venue (Attendance): Aztec Stadium (114,600)";
    public String pUSA1994 = "Host Nation (Year): USA (1994)\nWinner: Brazil\nGolden Boot Winner (Nationality): Hristo Stoichkov (Bulgaria)\nGoals (Penalties): 6 (3)\nFinal Venue (Attendance): Rose Bowl Stadium (94,194)";
    public String pJSK2002 = "Host Nations (Year): Japan and South Korea (2002)\nWinner: Brazil\nGolden Boot Winner (Nationality): Ronaldo Nazario (Brazil)\nGoals (Penalties): 8 (0)\nFinal Venue (Attendance): International Stadium Yokohama (69,029)";
    public String pQ2022 = "Host Nation (Year): Qatar (2022)\nWinner: Argentina\nGolden Boot Winner (Nationality): Kylian Mbappe (France)\nGoals (Penalties): 8 (2)\nFinal Venue (Attendance): Lusail Stadium (88,966)";
    public String lU1930 = "The 1930 World Cup, hosted in Uruguay, was the birth of the greatest sporting tournament in history. The 1930 world cup consisted of thirteen teams, with the historic final being played in the 90,000-capacity Estadio Centenario, in Montevideo, Uruguay. The victor of the first world cup was Uruguay, who beat Argentina 4-2 in the final to take home the trophy.";
    public String lS1958 = "The 1958 World Cup in Sweden was the birth of the greatest world cup legend of all time, Pele. Winning the Best Young Player Award, the 17-year-old Brazilian led his nation to their first world cup win. Moreover, in this tournament, Just Fontaine scored a record 13 goals for France, which is the most a player has scored in one tournament.";
    public String lC1962 = "Brazil’s victory in the 1962 World Cup final marked back-to-back wins for the Seleção, a feat only matched by Italy, who won the 1934 and 1938 world cups. Although Pele was injured for the majority of this world cup, fellow countryman Garrincha stepped up to the challenge, driving Brazil to glory, picking up the Golden Boot, Golden Ball, and the World Cup for his efforts.";
    public String lM1970 = "Brazil’s 4-1 victory over Italy in the 1970 World Cup final resulted in Pele obtaining his record-breaking third world cup, a number that has not been matched to this day. Moreover, Brazil’s 1970 World Cup lineup has been regarded by some as the greatest team to ever play in the World Cup, with the Seleção dominating the whole tournament and Pele being crowned the World Cup king by fans worldwide.";
    public String lM1986 = "Argentina’s world cup win in 1986 was largely due to the legendary performances of Diego Maradona. However, his greatest performance was against England in the quarterfinals, where he scored arguably the most famous goal in world cup history, the Hand of God. He did this by hitting the ball with his hand and pretending that he scored with his head, an action that referees didn’t catch. This and his solo goal helped Argentina progress and eventually win the whole tournament.";
    public String lUSA1994 = "Participating for the 15th time, Brazil marked this landmark appearance in the competition with a win in the penalty shootout against Italy in the final. The Seleção won 3-2 on penalties after misses from Baresi, Massaro, and Baggio. Baggio’s penalty was the most infamous one, as Italians began to cut off ponytails to symbolize their hate for the player, who had one at the time.";
    public String lJSK2002 = "Brazil’s most recent world cup win came in 2002, which was hosted in Japan and South Korea. However, the most famous aspect of the world cup wasn’t Brazil winning, but it was the iconic haircut of Ronaldo Nazario. The reason for the terrible haircut according to the player was to take everyone’s mind off the injury he had sustained the previous season, which paid off as he was the top scorer of the tournament, scoring both of Brazil’s goals in the final against Germany.";
    public String lQ2022 = "Argentina’s world cup win in the most recent run of the tournament resembled the certification of Messi as the greatest of all time, ending the GOAT debate between him and Penaldo. Scoring seven goals and assisting three, he drove a determined Argentina to the final against France, which turned out to be one of the most entertaining matches of all time. The match ended 3-3 with France coming back from 0-2 down to get it to penalties, which Argentina won through the heroics and mind games of their goalkeeper, Emi Martinez.";
    public static final String STRING_KEY = "save";
    public static final String STRING_KEY2 = "save2";
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list_id);
        textView2 = findViewById(R.id.textView2);
        iP = findViewById(R.id.iconicPic);
        names = new ArrayList<>();
        names.add("Uruguay (1930)");
        names.add("Sweden (1958)");
        names.add("Chile (1962)");
        names.add("Mexico (1970)");
        names.add("Mexico (1986)");
        names.add("USA (1994)");
        names.add("Japan and South Korea (2002)");
        names.add("Qatar (2022)");
        textView2.setText(" Famous World Cups");
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
            textView2.setGravity(View.TEXT_ALIGNMENT_CENTER);
            Log.d("LIFECYCLETAG", "Portrait onCreate");
            if(savedInstanceState != null){
                names = savedInstanceState.getStringArrayList(STRING_KEY);
                textView2.setText(savedInstanceState.getString(STRING_KEY2));
            }
        }else{
            Log.d("LIFECYCLE", "Landscape onCreate");
            if(savedInstanceState != null){
                names = savedInstanceState.getStringArrayList(STRING_KEY);
                textView2.setText(savedInstanceState.getString(STRING_KEY2));
            }
        }

        CustomAdapter adapter = new CustomAdapter(this, R.layout.adapter_layout, names);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(names.get(position)) {
                    case "Uruguay (1930)":
                        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
                            textView2.setText(pU1930);
                        }else{
                            iP.setImageResource(R.drawable.uruguay1930);
                            textView2.setText(lU1930);
                        }
                        break;
                    case "Sweden (1958)":
                        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
                            textView2.setText(pS1958);
                        }else{
                            iP.setImageResource(R.drawable.sweden1958);
                            textView2.setText(lS1958);
                        }
                        break;
                    case "Chile (1962)":
                        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
                            textView2.setText(pC1962);
                        }else{
                            iP.setImageResource(R.drawable.chile1962);
                            textView2.setText(lC1962);
                        }
                        break;
                    case "Mexico (1970)":
                        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
                            textView2.setText(pM1970);
                        }else{
                            iP.setImageResource(R.drawable.mexico1970);
                            textView2.setText(lM1970);
                        }
                        break;
                    case "Mexico (1986)":
                        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
                            textView2.setText(pM1986);
                        }else{
                            iP.setImageResource(R.drawable.mexico1986);
                            textView2.setText(lM1986);
                        }
                        break;
                    case "USA (1994)":
                        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
                            textView2.setText(pUSA1994);
                        }else{
                            iP.setImageResource(R.drawable.usa1994);
                            textView2.setText(lUSA1994);
                        }
                        break;
                    case "Japan and South Korea (2002)":
                        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
                            textView2.setText(pJSK2002);
                        }else{
                            iP.setImageResource(R.drawable.japan_southkorea2002);
                            textView2.setText(lJSK2002);
                        }
                        break;
                    case "Qatar (2022)":
                        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
                            textView2.setText(pQ2022);
                        }else{
                            iP.setImageResource(R.drawable.qatar2022);
                            textView2.setText(lQ2022);
                        }
                        break;
                }
            }
        });
    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("Lifecycle", "SAVE");
        outState.putStringArrayList(STRING_KEY, names);
        outState.putString(STRING_KEY2, textView2.getText().toString());
    }
    @Override
    protected void onStart() {
        Log.d("LIFECYCLE", "Start");
        super.onStart();
    }
}
