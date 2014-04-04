package com.f0x.eddymalou;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	MediaPlayer mp;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		((Button) findViewById(R.id.Button_activisme)).setOnClickListener(onClickListener);
		((Button) findViewById(R.id.Button_allusion)).setOnClickListener(onClickListener);
		((Button) findViewById(R.id.button_bijectivite)).setOnClickListener(onClickListener);
		((Button) findViewById(R.id.button_calcul)).setOnClickListener(onClickListener);
		((Button) findViewById(R.id.button_cestclair)).setOnClickListener(onClickListener);
		((Button) findViewById(R.id.button_compendium)).setOnClickListener(onClickListener);
		((Button) findViewById(R.id.button_congo)).setOnClickListener(onClickListener);
		((Button) findViewById(R.id.button_congolais)).setOnClickListener(onClickListener);
		((Button) findViewById(R.id.button_eddy)).setOnClickListener(onClickListener);
		((Button) findViewById(R.id.button_fromage)).setOnClickListener(onClickListener);
		((Button) findViewById(R.id.button_nuclearite)).setOnClickListener(onClickListener);
		((Button) findViewById(R.id.button_onshore)).setOnClickListener(onClickListener);
		((Button) findViewById(R.id.button_travail)).setOnClickListener(onClickListener);
		((Button) findViewById(R.id.button_eventualiste)).setOnClickListener(onClickListener);
		((Button) findViewById(R.id.button_valium)).setOnClickListener(onClickListener);
	}
	
	private OnClickListener onClickListener = new OnClickListener() {
	     @Override
	     public void onClick(View v) {
	         switch(v.getId()){
	             case R.id.Button_activisme:
	                 new Thread(){
	                     public void run(){
	    	            	MediaPlayer.create(MainActivity.this, R.raw.activisme).start();
	                     }
	                 }.start();	             
	             break;
	             case R.id.Button_allusion:
	                 new Thread(){
	                     public void run(){
	    	            	 MediaPlayer.create(MainActivity.this, R.raw.allusion).start();
	                     }
	                 }.start();	  
	             break;
	             case R.id.button_bijectivite:
	                 new Thread(){
	                     public void run(){
	    	            	 MediaPlayer.create(MainActivity.this, R.raw.bijectivite).start();   
	                     }
	                 }.start();	  
	             break;
	             case R.id.button_calcul:
	                 new Thread(){
	                     public void run(){
	    	            	 MediaPlayer.create(MainActivity.this, R.raw.calcul).start();
	                     }
	                 }.start();	  
	             break;
	             case R.id.button_cestclair:
	                 new Thread(){
	                     public void run(){
	    	            	 MediaPlayer.create(MainActivity.this, R.raw.cestclair).start();
	                     }
	                 }.start();	  
	             break;
	             case R.id.button_compendium:
	                 new Thread(){
	                     public void run(){
	    	            	 MediaPlayer.create(MainActivity.this, R.raw.compendium).start();
	                     }
	                 }.start();	  
	             break;
	             case R.id.button_congo:
	                 new Thread(){
	                     public void run(){
	    	            	 MediaPlayer.create(MainActivity.this, R.raw.congo).start();
	                     }
	                 }.start();	  
	             break;
	             case R.id.button_congolais:
	                 new Thread(){
	                     public void run(){
	    	            	 MediaPlayer.create(MainActivity.this, R.raw.congolais).start();
	                     }
	                 }.start();	  
	             break;
	             case R.id.button_eddy:
	                 new Thread(){
	                     public void run(){
	    	            	 MediaPlayer.create(MainActivity.this, R.raw.eddy).start();
	                     }
	                 }.start();	  
	             break;
	             case R.id.button_fromage:
	                 new Thread(){
	                     public void run(){
	    	            	 MediaPlayer.create(MainActivity.this, R.raw.quatre).start();
	                     }
	                 }.start();	  
	             break;
	             case R.id.button_nuclearite:
	                 new Thread(){
	                     public void run(){
	    	            	 MediaPlayer.create(MainActivity.this, R.raw.nuclearite).start();
	                     }
	                 }.start();	  
	             break;
	             case R.id.button_onshore:
	                 new Thread(){
	                     public void run(){
	    	            	 MediaPlayer.create(MainActivity.this, R.raw.onshore).start();
	                     }
	                 }.start();	  
	             break;
	             case R.id.button_travail:
	                 new Thread(){
	                     public void run(){
	    	            	 MediaPlayer.create(MainActivity.this, R.raw.travail).start();
	                     }
	                 }.start();	  
	             break;
	             case R.id.button_eventualiste:
	                 new Thread(){
	                     public void run(){
	                    	 MediaPlayer.create(MainActivity.this, R.raw.up).start();
	                     }
	                 }.start();	  
	             break;
	             case R.id.button_valium:
	                 new Thread(){
	                     public void run(){
	    	            	 MediaPlayer.create(MainActivity.this, R.raw.valium).start();
	                     }
	                 }.start();	  
	             break;
	         }

	   }
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle item selection
	    switch (item.getItemId()) {
	        case R.id.action_quit:
	        	System.exit(1);
	            return true;
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}

}
