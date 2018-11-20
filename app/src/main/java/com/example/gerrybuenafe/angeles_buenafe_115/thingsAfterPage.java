package com.example.gerrybuenafe.angeles_buenafe_115;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class thingsAfterPage extends AppCompatActivity {
    Toolbar mToolbar;
    TextView mTitle;

    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listHash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_after_page);
        mToolbar = findViewById(R.id.toolB);
        mTitle = mToolbar.findViewById(R.id.toolbar_title);

        setSupportActionBar(mToolbar);
        mTitle.setText("THINGS TO REMEMBER AFTER THE FLOOD");

        getSupportActionBar().setDisplayShowTitleEnabled(false);

        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        listView = findViewById(R.id.expandable);
        initData();
        listAdapter = new expandableListAdapter(this, listDataHeader, listHash);
        listView.setAdapter(listAdapter);

    }

    private void initData(){
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("Re-entering your home");
        listDataHeader.add("Ensure building safety");
        listDataHeader.add("Water");
        listDataHeader.add("Documentation");
        listDataHeader.add("Recommended flood cleanup equipment");
        listDataHeader.add("Heating and appliances");
        listDataHeader.add("Dirt and debris");
        listDataHeader.add("Structures");
        listDataHeader.add("Carpets and furniture");
        listDataHeader.add("Mould");
        listDataHeader.add("Food and medicine");
        listDataHeader.add("What to discard");
        listDataHeader.add("What is salvageable");
        listDataHeader.add("Once the flood waters have receded, you must not live in your house until");


        List<String> enter = new ArrayList<>();
        enter.add("Do not return home until authorities have advised that it is safe to do so");
        enter.add("If the main power switch was not turned off prior to flooding, do not re-enter your home until a qualified electrician has determined it is safe to do so");
        enter.add("Use extreme caution when returning to your home after a flood");
        enter.add("Appliances that may have been flooded pose a risk of shock or fire when turned on. Do not use any appliances, heating, pressure, or sewage system until electrical components have been thoroughly cleaned, dried, and inspected by a qualified electrician");
        enter.add("The main electrical panel must be cleaned, dried, and tested by a qualified electrician to ensure that it is safe");
        enter.add("Depending on where you live, your municipal or the provincial inspection authority is responsible for the permitting process required before your electric utility can reconnect power to your homes");


        List<String> ensure = new ArrayList<>();
        ensure.add("Make sure your vehicle has enough fuel");
        ensure.add("Follow recommended routes. DO NOT sightsee");
        ensure.add("Avoid disaster areas. Your presence might hamper rescue or other emergency operations and put you at further risk");


        List<String> water = new ArrayList<>();
        water.add("Flood water can be heavily contaminated with sewage and other pollutants. It can cause sickness and infections");
        water.add("If your house has been flooded and you have a well, don't drink the water. Have it tested first");
        water.add("Household items that have been flood-damaged will have to be discarded according to local regulations");
        water.add("Remove water from your flooded home slowly. Drain it in stages - about one third of the volume daily - because if the ground is still saturated and water is removed too quickly, the walls or the floor could buckle");
        water.add("Use pumps or pails to remove standing water, then a wet/dry shop vacuum to mop up the rest");


        List<String> docu = new ArrayList<>();
        docu.add("Store all valuable papers that have been damaged in a freezer until they are needed (After your cleanup, consult your lawyer to determine whether flood-damaged documents, or just the information in them, must be retained)");
        docu.add("Record details of flood damage by photograph or video, if possible");


        List<String> reco = new ArrayList<>();
        reco.add("Gloves");
        reco.add("Masks and other protective gear");
        reco.add("Pails, mops and squeegees");
        reco.add("Plastic garbage bags");
        reco.add("Unscented detergent");
        reco.add("Large containers for soaking bedding, clothing and linens, and clotheslines to hang them to dry");

        List<String> heat = new ArrayList<>();
        heat.add("Do not heat your home to more than 4°C (about 40°F) until all of the water is removed");
        heat.add("Do not use flooded appliances, electrical outlets, switch boxes or fuse-breaker panels until they have been checked by your local utility");
        heat.add("Whether you use a wood, gas or electrical heating system, have it thoroughly inspected by a qualified technician before using it again. Replace the furnace blower motor, switches and controls if they have been soaked");
        heat.add("Replace filters and insulation inside furnaces, water heaters, refrigerators and freezers if they have been wet. However, it is often cheaper to replace this equipment");

        List<String> dirt = new ArrayList<>();
        dirt.add("Remove all soaked and dirty materials as well as debris");
        dirt.add("Hose down any dirt sticking to walls and solid-wood furniture then rinse several times");
        dirt.add("Wash and wipe down all surfaces and structures with unscented detergent and water. Rinse");

        List<String> struc = new ArrayList<>();
        struc.add("Ventilate or dehumidify the house until it is completely dry");
        struc.add("Rinse and then clean all floors as quickly as possible");
        struc.add("Replace flooring that has been deeply penetrated by flood water or sewage");
        struc.add("lean all interior wall and floor cavities with a solution of water and unscented detergent");

        List<String> carpet = new ArrayList<>();
        carpet.add("Carpets must be dried within the first two days. For large areas, hire a qualified professional to do the job. Carpets soaked with sewage must be discarded immediately");
        carpet.add("Remove residual mud and soil from furniture, appliances, etc");
        carpet.add("If items are just damp, let the mud dry and then brush it off");
        carpet.add("Wooden furniture: Remove drawers and open doors. Do not dry quickly or splitting may occur");


        List<String> mould = new ArrayList<>();
        mould.add("Mould can lead to serious health problems");
        mould.add("You may need to have your home professionally cleaned for it to be covered by insurance. Check with your insurance company");
        mould.add("If you are cleaning up in a room where mould is present, wear a face mask and disposable gloves");
        mould.add("To minimize mould growth, move items to a cool, dry area within 48 hours and set up fans");
        mould.add("Alternatively, textiles, furs, paper and books can be frozen until they are treated");
        mould.add("Wet mould will smear if wiped. Let it dry and then brush it off outdoorss");
        mould.add("You can also kill mould spores by lightly misting the item with isopropanol (rubbing alcohol");

        List<String> food = new ArrayList<>();
        food.add("All undamaged canned goods must be thoroughly washed and disinfected");
        food.add("Dispose of all medicines, cosmetics and other toiletries that have been exposed to flood water");
        food.add("Dispose of any of the following food items if they have been exposed to flood water: Contents of freezer or refrigerator, including all meats and all fresh fruit and vegetables, all boxed foods, all bottled drinks and products in jars, cans with large dents or that reveal seepage");

        List<String> discard = new ArrayList<>();
        discard.add("All insulation materials, particleboard furniture, mattresses, box springs, stuffed toys, pillows, padding, cushions and furniture coverings that have been exposed to flood water");


        List<String> sal = new ArrayList<>();
        sal.add("Frames of high-quality furniture can often be saved. However, they must first be cleaned, disinfected and rinsed, then dried by ventilation away from direct sunlight or heat. Drying too quickly can cause warping and cracking");
        sal.add("Clothes can be cleaned. Scrape heavy dirt from washable clothes. Rinse and wash them several times with detergent and dry quickly");


        List<String> before = new ArrayList<>();
        before.add("The regular water supply has been inspected and officially declared safe for use");
        before.add("Every flood-contaminated room has been thoroughly cleaned, disinfected and surface-dried");
        before.add("All contaminated dishes and utensils have been thoroughly washed and disinfected - either by using boiling water or by using a sterilizing solution of one part chlorine bleach to four parts water. Rinse dishes and utensils thoroughly");
        before.add("Adequate toilet facilities are available");


        listHash.put(listDataHeader.get(0),enter);
        listHash.put(listDataHeader.get(1),ensure);
        listHash.put(listDataHeader.get(2),water);
        listHash.put(listDataHeader.get(3),docu);
        listHash.put(listDataHeader.get(4),reco);
        listHash.put(listDataHeader.get(5),heat);
        listHash.put(listDataHeader.get(6),dirt);
        listHash.put(listDataHeader.get(7),struc);
        listHash.put(listDataHeader.get(8),carpet);
        listHash.put(listDataHeader.get(9),mould);
        listHash.put(listDataHeader.get(10),food);
        listHash.put(listDataHeader.get(11),discard);
        listHash.put(listDataHeader.get(12),sal);
        listHash.put(listDataHeader.get(13),before);

    }

        @Override
        public boolean onOptionsItemSelected(MenuItem item){
            if(item.getItemId()==android.R.id.home)
                finish();
            return super.onOptionsItemSelected(item);
        }
}
