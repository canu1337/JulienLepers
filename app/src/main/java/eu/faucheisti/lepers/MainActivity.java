package eu.faucheisti.lepers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.content.res.Resources;
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
		setContentView(eu.faucheisti.lepers.R.layout.activity_main);
        Resources res = getResources();

        final ListView listview = (ListView) findViewById(eu.faucheisti.lepers.R.id.soundlist);
        String[] values = res.getStringArray(R.array.sounds_array);
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
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.ahoui).start();}}.start();
			break;
			case 1:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.ca_cest_bon).start();}}.start();
			break;
			case 2:
			new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.caalors).start();}}.start();
			break;
            case 3:
                new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.il_pleut_des_questions).start();}}.start();
            break;
            case 4:
                new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.maisouibiensur).start();}}.start();
            break;
            case 5:
                new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.ohlalala).start();}}.start();
            break;
            case 6:
                new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.ouaisouais).start();}}.start();
            break;
            case 7:
                new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.ouaisouaisouais).start();}}.start();
            break;
            case 8:
                new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.oui).start();}}.start();
            break;
            case 9:
                new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.oui_ca_y_est_c_est_bon).start();}}.start();
            break;
            case 10:
                new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.ouioui).start();}}.start();
            break;
            case 11:
                new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.ouiouiouioui).start();}}.start();
            break;
            case 12:
                new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.wowowow).start();}}.start();
            break;
            case 13:
                new Thread(){ public void run(){ MediaPlayer.create(MainActivity.this, R.raw.zizi_lepers).start();}}.start();
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
		getMenuInflater().inflate(eu.faucheisti.lepers.R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case eu.faucheisti.lepers.R.id.action_quit:
			System.exit(1);
			return true;
			default:
			return super.onOptionsItemSelected(item);
		}
	}

}
