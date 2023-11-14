////package com.example.dreamdive;
////
////import androidx.appcompat.app.AppCompatActivity;
////
////import android.content.Intent;
////import android.media.MediaPlayer;
////import android.os.Bundle;
////import android.view.View;
////import android.widget.Button;
////
////import com.google.android.material.floatingactionbutton.FloatingActionButton;
////
////public class  extends AppCompatActivity {
//    Button back;
//    FloatingActionButton back1;
//    MediaPlayer audio;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.);
//        audio=MediaPlayer.create(.this,R.raw.);
//
//        back1=findViewById(R.id.navgationn);
//        back1.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(.this,AdventureActivity.class);
//                startActivity(intent);
//
//            }
//
//        });
//    }
//    public void playit (View v) {
//        audio.start();
//    }
//    @Override
//    public void onPause () {
//        super.onPause();
//        audio.release();
//    }
////}
////
////
//
//
//
//<RelativeLayout
//        android:id="@+id/relativeLayout"
//                android:layout_width="0dp"
//                android:layout_height="0dp"
//                android:orientation="vertical"
//                app:layout_constraintBottom_toBottomOf="parent"
//                app:layout_constraintEnd_toEndOf="parent"
//                app:layout_constraintStart_toStartOf="parent"
//                app:layout_constraintTop_toTopOf="parent">
//
//<ScrollView
//            android:layout_width="391dp"
//                    android:layout_height="677dp">
//
//
//<LinearLayout
//                android:layout_width="match_parent"
//                        android:layout_height="wrap_content"
//                        android:orientation="vertical">
//
//
//<LinearLayout
//                    android:layout_width="match_parent"
//                            android:layout_height="match_parent"
//                            android:orientation="horizontal">
//
//<ImageView
//                        android:id="@+id/imageView2"
//                                android:layout_width="400dp"
//                                android:layout_height="400dp"
//                                android:scaleType="fitXY"
//                                app:srcCompat="@drawable/s1" />
//</LinearLayout>
//
//<LinearLayout
//                    android:layout_width="match_parent"
//                            android:layout_height="match_parent"
//                            android:orientation="vertical">
//
//
//<ImageButton
//                        android:id="@+id/playaudio"
//                                android:layout_width="50dp"
//                                android:layout_height="50dp"
//                                android:layout_marginStart="170dp"
//                                android:layout_marginBottom="20dp"
//                                android:onClick="playit"
//                                android:background="@drawable/playaudio" />
//
//<TextView
//                        android:id="@+id/textView8"
//                                android:layout_width="wrap_content"
//                                android:layout_height="wrap_content"
//                                android:layout_margin="10dp"
//                                android:layout_weight="1"
//                                android:fontFamily="@font/sars"
//        android:textColor="@color/black"
//        android:textSize="15dp" />
//        </LinearLayout>
//
//        </LinearLayout>
//
//
//        </ScrollView>
//
//        <com.google.android.material.floatingactionbutton.FloatingActionButton
//        android:id="@+id/navgationn"
//        android:layout_width="wrap_content"
//        android:layout_height="wrap_content"
//        android:layout_alignParentStart="true"
//        android:layout_alignParentBottom="true"
//        android:layout_marginStart="10dp"
//        android:layout_marginBottom="30dp"
//        android:src="@drawable/ic_baseline_arrow_circle_left_24"
//        app:backgroundTint="#88FFFFFF"
//        app:maxImageSize="70dp"
//        app:menu="@menu/bottom_menu"
//        app:tint="@color/purple_200"
//        tools:ignore="SpeakableTextPresentCheck,SpeakableTextPresentCheck,SpeakableTextPresentCheck"></com.google.android.material.floatingactionbutton.FloatingActionButton>
//
//        </RelativeLayout>