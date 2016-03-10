package csmit.cb.au.carteblanche2k16;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class workshop_mex extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workshop);

       Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setEnabled(false);
        toolbar.setTitle("MECH Workshop");
   //     setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);


    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_workshop, container, false);

            ImageView image = (ImageView) rootView.findViewById(R.id.section_label);
            TextView description=(TextView)rootView.findViewById(R.id.description);
            TextView details=(TextView)rootView.findViewById(R.id.details);
            TextView organizer=(TextView)rootView.findViewById(R.id.organizer);
            TextView title=(TextView)rootView.findViewById(R.id.title);
            if(getArguments().getInt(ARG_SECTION_NUMBER)==1) {
                image.setBackgroundResource(R.drawable.arduino);
                title.setText("Arduino Workshop");
                description.setText("\nArduino is an open-source computer hardware and software company, project and user community that designs and manufactures microcontroller-based kits for building digital devices and interactive objects that can sense and control objects in the physical world.\n");
                details.setText("\nAMOUNT:900 INR\nDATE:18-03-2016 \nTIME:9.00 am to 4.00 pm\n");
                organizer.setText("\nSurya - 9486834341\nVignesh - 8675202263\n");
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==2)
            {
                image.setBackgroundResource(R.drawable.engine);
                title.setText("Automotive Engine");
                description.setText("\nCrazy about cars? eager to know how one of the best inventions work? Answer lies while exploring the heart of this invention. Yeah, it's the engines. Carteblanche 16 brings you a chance to discover functioning of an automotive engine. Learn how the fuel propels the vehicle forward.\n");
                details.setText("\nAMOUNT:900 INR\nDATE:19-03-2016\nTIME:9.00 am to 4.00 pm\n");
                organizer.setText("\nKAVI-8760214581\nKATHIR-8122292711\n");
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==3)
            {
                image.setBackgroundResource(R.drawable.threed);
                title.setText("3d Printing Workshop");
                description.setText("\nSynthesising 3D objects becomes a reality with 3D printing. Carteblanche 16 provides you a chance to get familiarised with the various additive manufacturing techniques which is certain to mark the beginning of a third industrial revolution.\n");
                details.setText("\nAMOUNT: 700 INR\n" +
                        "\nDATE:20-03-2016\n" +
                        "\nTIME:9.00 am to 4.00 pm\n");
                organizer.setText("\nUVA VIGNESH-9543804633\nMOHAN-9597355407\n");
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==4)
            {
                image.setBackgroundResource(R.drawable.ai);
                title.setText("Automotive Electronics");
                description.setText("\nAutomotive Electronics, Technologies and Management\n");
                details.setText("\nAMOUNT:900 INR\n" +
                        "DATE:18-03-2016\n" +
                        "TIME:9.00 am to 4.00 pm\n");
                organizer.setText("\nJAGAN-9176370459\nJAYASIVA-9578584158\n");
            }
            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "1";
                case 1:
                    return "2";
                case 2:
                    return "3";
                case 3:
                    return "4";
            }
            return null;
        }
    }
}
