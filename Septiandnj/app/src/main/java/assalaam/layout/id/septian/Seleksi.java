package assalaam.layout.id.septian;

import android.os.Bundle;
import android.app.ListActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Seleksi extends ListActivity {
    /** Called when the activity is first created. */
    TextView seleksi;
    String[] pilihan = {
            "Merbabu", "Merapi", "Lawu", "Rinjani",
            "Sumbing", "Sindoro", "Krakatau", "Selat Sunda", "Selat Bali",
            "Selat Malaka", "Kalimantan", "Sulawesi", "Jawa" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleksi);

        setListAdapter(new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1, pilihan));
        seleksi = (TextView) findViewById(R.id.yangDipilih);
    }

    public void onListItemClick(ListView parent, View v, int position, long id) {
        seleksi.setText(pilihan[position]);
    }
}
