package com.f0x.eddymalou;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	MediaPlayer mp;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final ListView listview = (ListView) findViewById(R.id.soundlist);
		String[] values = new String[] { 
			"Non non non", "Végétalisme", "Fidéles", "Allusion", 
			"Vallium", "Les congolais!", "Posmi", "L'éstime du Savoir", "Eddy le premier savant", 
			"Technicité informatisé", "Onshore insiding outsiding", "Oui mais c'est clair!", 
			"Qui dit congo", "Nous devons encadrer", "La dynamique des sports", "C'est systematique", 
			"On voit la nucléarité", "La formule 1 + (2*5)", "La relaxation", "C'est une quermence", 
			"Encrystaliser imposer", "Fait allusion au dynamisme", "TGO", "Mais oui c'est clair!", 
			"De la république Eddy malou", "Kilometrages offshore", "Mandoukar edbibé", 
			"La congoléxicomatisation", "E double d", "C'est une bijectivité", 
			"Faire allusion à informatiser", "C'est l'homme", "Je vous en prie", "Quatres carées fous de fromage",
			"Travail Travail!", "Le compendium"
		};
		
		final ArrayList<String> list = new ArrayList<String>();
		
		for (int i = 0; i < values.length; ++i) {
			list.add(values[i]);
		}
		
		final StableArrayAdapter adapter = new StableArrayAdapter(this,
			android.R.layout.simple_list_item_1, list);
		listview.setAdapter(adapter);
		
		listview.setClickable(true);
		listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
				PlaySound(position);
			}
		});
		
	}

	public void PlaySound(int Index)
	{
		switch(Index)
		{
			case 0:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.nonnonnon).start();}}.start();	
			break;
			case 1:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.vegetalisme).start();}}.start();	
			break;
			case 2:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.fideles).start();}}.start();	
			break;
			case 3:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.allusion).start();}}.start();	
			break;
			case 4:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.vallium).start();}}.start();	
			break;
			case 5:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.lescongolais).start();}}.start();	
			break;
			case 6:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.posmi).start();}}.start();	
			break;
			case 7:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.savoir).start();}}.start();	
			break;
			case 8:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.eddy).start();}}.start();	
			break;
			case 9:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.technicite).start();}}.start();	
			break;
			case 10:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.onshore).start();}}.start();	
			break;
			case 11:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.ouimaiscestclair).start();}}.start();	
			break;
			case 12:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.quiditcongo).start();}}.start();	
			break;
			case 13:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.encadrer).start();}}.start();	
			break;
			case 14:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.activisme).start();}}.start();	
			break;
			case 15:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.systematique).start();}}.start();	
			break;
			case 16:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.nuclearite).start();}}.start();	
			break;
			case 17:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.formule).start();}}.start();	
			break;
			case 18:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.relaxation).start();}}.start();	
			break;
			case 19:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.quermence).start();}}.start();	
			break;
			case 20:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.encrystaliser).start();}}.start();	
			break;
			case 21:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.dynamisme).start();}}.start();	
			break;
			case 22:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.tgo).start();}}.start();	
			break;
			case 23:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.maisouicestclair).start();}}.start();	
			break;
			case 24:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.republiqueeddy).start();}}.start();	
			break;
			case 25:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.kilometrages).start();}}.start();	
			break;
			case 26:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.mandoukaredbibe).start();}}.start();	
			break;
			case 27:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.congolexicomatisation).start();}}.start();	
			break;
			case 28:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.edoubled).start();}}.start();	
			break;
			case 29:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.bijectivite).start();}}.start();	
			break;
			case 30:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.informatise).start();}}.start();	
			break;
			case 31:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.lhomme).start();}}.start();	
			break;
			case 32:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.jevousenprie).start();}}.start();	
			break;
			case 33:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.quatrescarees).start();}}.start();	
			break;
			case 34:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.travail).start();}}.start();	
			break;
			case 35:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.compendium).start();}}.start();	
			break;
			
		}
	}
	
	private class StableArrayAdapter extends ArrayAdapter<String> {
		
		HashMap<String, Integer> mIdMap = new HashMap<String, Integer>();
		
		public StableArrayAdapter(Context context, int textViewResourceId,
			List<String> objects) {
			super(context, textViewResourceId, objects);
			for (int i = 0; i < objects.size(); ++i) {
				mIdMap.put(objects.get(i), i);
			}
		}
		
		@Override
		public long getItemId(int position) {
			String item = getItem(position);
			return mIdMap.get(item);
		}
		
		@Override
		public boolean hasStableIds() {
			return true;
		}
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case R.id.action_quit:
			System.exit(1);
			return true;
			default:
			return super.onOptionsItemSelected(item);
		}
	}

}
