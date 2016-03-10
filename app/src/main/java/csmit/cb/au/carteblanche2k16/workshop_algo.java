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

public class workshop_algo extends AppCompatActivity {

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
        toolbar.setTitle("ALGO Workshop");
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
                image.setBackgroundResource(R.drawable.android);
                title.setText("Android Workshop");
                description.setText("\nDo you know that Android is the most popular Mobile platform and powers hundreds of millions of Mobile devices in more than 190 countries around the world? Besides being free, it is also open source, which serves as the place for Developers to explore it. With several hundreds of cool apps hitting the Android market, why not develop your own app?\n");
                details.setText("\nAMOUNT:900INR\nDATE:20.03.2016\nTIME:9.00AM-4.00PM\n");
                organizer.setText("\nR.Radhika-9677743238\nR.Abipriya-9488715459\n");
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==2)
            {
                image.setBackgroundResource(R.drawable.webdesign);
                title.setText("Web Development");
                description.setText("\nWeb Development encompasses many different skills and disciplines in the production and maintenance of websites. The different areas of web design include web graphic design; interface design; authoring, including standardised code and proprietary software; user experience design; and search engine optimization\n");
                details.setText("\nAMOUNT:800INR\nDATE:18.03.2016\nTIME:9.00AM-4.00PM\n");
                organizer.setText("\nP.M.Suganya-9952187622\nT.NThamarai Selvi-94445649354\n");
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==3)
            {
                image.setBackgroundResource(R.drawable.eh);
                title.setText("Networking and Hacking");
                description.setText("\nHave you ever thought of building up a security design to protect your system from any malicious attacks? The workshop on Ethical Hacking helps you check the system for vulnerabilities, so that it is not exploited by any malicious attacker. Ethical Hacking is an emerging trend, where sensitive and classified data have to be prevented from malicious attacker.\n");
                details.setText("\nAMOUNT:1200INR\n" +
                        "\nDATE:18.03.2016\n" +
                        "\nTIME:9.00AM-4.00PM\n");
                organizer.setText("\nS.Nandhini-9965467712\nS.Aanandha Valli-9578158167\n");
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==4)
            {
                image.setBackgroundResource(R.drawable.py);
                title.setText("Python Workshop");
                description.setText("\nPython is an interpreted, object-oriented programming language similar to PERL, that has gained popularity because of its clear syntax and readability. Python is said to be relatively easy to learn and portable, meaning its statements can be interpreted in a number of operating systems, including UNIX-based systems, Mac OS, MS-DOS, OS/2, and various versions of Microsoft Windows 98. Python was created by Guido van Rossum, a former resident of the Netherlands, whose favorite comedy group at the time was Monty Pythons Flying Circus.\n");
                details.setText("\nAMOUNT:500INR\n" +
                        "DATE:20.03.2016\n" +
                        "TIME:9.00AM-4.00PM\n");
                organizer.setText("\nS.Saranya-984189343\nE.Silambarasi-9600873956\n");
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==5)
            {
                image.setBackgroundResource(R.drawable.iot);
                title.setText("Internet of Things");
                description.setText("\nThe Internet of Things (IoT) is the network of physical objects devices, vehicles, buildings and other items which are embedded with electronics, software, sensors, and network connectivity, which enables these objects to collect and exchange data.\n");
                details.setText("\nAMOUNT:5000INR\n" +
                        "DATE:19.03.2016\n" +
                        "TIME:9.00AM-4.00PM\n");
                organizer.setText("\nPrabakaran - 9488956764\n" +
                        "Ganapathy - 9790843773\n");
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
            return 5;
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
                case 4:
                    return "5";
            }
            return null;
        }
    }
}
