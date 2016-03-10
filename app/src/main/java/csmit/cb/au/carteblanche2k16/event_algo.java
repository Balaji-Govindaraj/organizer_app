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

public class event_algo extends AppCompatActivity {

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
        toolbar.setTitle("ALGO Events");
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
            View rootView = inflater.inflate(R.layout.fragment_workshop1, container, false);

            ImageView image = (ImageView) rootView.findViewById(R.id.section_label);
            TextView description=(TextView)rootView.findViewById(R.id.description);
            TextView details=(TextView)rootView.findViewById(R.id.details);
            TextView organizer=(TextView)rootView.findViewById(R.id.organizer);
            TextView title=(TextView)rootView.findViewById(R.id.title);
            TextView title1=(TextView)rootView.findViewById(R.id.title1);
            TextView description1=(TextView)rootView.findViewById(R.id.description1);
            if(getArguments().getInt(ARG_SECTION_NUMBER)==1) {
                image.setBackgroundResource(R.drawable.debugging);
                title.setText("DEBUGGING");
                description.setText("\nLens on the bee! Let it be of any data type and whatever be the programming language! Are you a compiler to debug it ? Its a place for your interpretation!\n");
                description1.setText("\nAnyone with a valid college identity card can participate.\n" +
                        "No Member can be part of more than one team.\n" +
                        "Team Members need not be from the same college/institute.\n" +
                        "Decisions made by the Judges will be final\n");
                details.setText("\nRound 1-Written (MCQ)\n" +
                        "Round 2-Practical \n");
                organizer.setText("\nsushma-(+91)9791015295\n");
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==2)
            {
                image.setBackgroundResource(R .drawable.hackknight);
                title.setText("HACKKNIGHT");
                description.setText("\nExploring a world miles away from home,One of the greatest feelings ever known,You are there and back everywhere,All without having to leave your chair,We never steal nor do we commit murder,More advanced than you have ever seen,Tap into data and get a job done,The Legends call us Hackers,While others call us Crackers,We are all very smart,And have been since the start,This is a universal message to the entire fleet,We are at a higher level for we are the Elite.\n");
                description1.setText("\nAnyone with a valid college identity card can participate.\n" +
                        "No Member can be part of more than one team.\n" +
                        "Team Members need not be from the same college/institute.\n" +
                        "Decisions made by the Judges will be final\n");
                details.setText("\nRound 1 - Written (MCQ)\n" +
                        "Round 2 - Practical \n");
                organizer.setText("\nsridhar babu-(+91)9445702691\n");
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==3)
            {
                image.setBackgroundResource(R.drawable.inscribed);
                title.setText("INSCRIBED");
                description.setText("\nAre you waiting for a complete entertainer? Are you a wit in puzzle solving? You are in the right place! Coding geeks..! Its time for you to shut down your coding skill and test your intellectual in algorithms and problem/puzzle solving methodologies. This wll be just an amazing, thrilling experience filled with fun and enthusiasm. You need not code, compile or execute! But just use your wit to answer the questions posed to you..! As stated earlier, INSCRIBED is a complete entertainer ,where there is no Coding, no Compiling, no Debugging. Still, this stays to be a fun-filled journey..!!!! You ve to cruise thru 2 fun-filled rounds to reach your destination of victory. Have a great cruise ahead..! BON VOYAGE!\n");
                description1.setText("\nAnyone with a valid college identity card can participate.\n" +
                        "No Member can be part of more than one team.\n" +
                        "Team Members need not be from the same college/institute.\n" +
                        "Decisions made by the Judges will be final\n");
                details.setText("\nRound 1 - Written (MCQ)\n" +
                        "Round 2 - Practical \n");
                organizer.setText("\nkaviarasi-(+91)9841281638\n");
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==4)
            {
                image.setBackgroundResource(R.drawable.reversecoding);
                title.setText("REVERSE CODING");
                description.setText("\nAre you one of those gifted few who can spot a bug like the eagle does a mouse? Instead of asking, How do I solve this problem? ask,How could I possibly cause the problem? Brainstorm the reverse problem to generate reverse solution ideas and robust solutions. Be sure to follow the basic rules of brainstorming to explore possible solutions to the full.\n");
                description1.setText("\nAnyone with a valid college identity card can participate.\n" +
                        "No Member can be part of more than one team.\n" +
                        "Team Members need not be from the same college/institute.\n" +
                        "Decisions made by the Judges will be final\n");
                details.setText("\nRound 1 - Written (MCQ)\n" +
                        "Round 2 - Practical \n");
                organizer.setText("\nK.C.Krithika-(+91)7708424260\n");
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==5)
            {
                image.setBackgroundResource(R.drawable.streetcoding);
                title.setText("STREET CODING");
                description.setText("\nBillions of devices are coded to work. Are you loaded with codes? Here is the place to check the intensity of your code thirst. Come and immerse yourself in the sea of codes and challenge others with your geeky brilliance\n");
                description1.setText("\nAnyone with a valid college identity card can participate.\n" +
                        "No Member can be part of more than one team.\n" +
                        "Team Members need not be from the same college/institute.\n" +
                        "Decisions made by the Judges will be final\n");
                details.setText("\nRound 1 - Written (MCQ)\n" +
                        "Round 2 - Practical \n");
                organizer.setText("\nsevanthi s-(+91)9500639588\n");
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==6)
            {
                image.setBackgroundResource(R.drawable.webdesign);
                title.setText("WEB DESIGNING");
                description.setText("\nIts time to play with markup!!! Everything is designed, but few things are designed well. If you are a designer with sense and simplicity, you can paint the world with your colours of imagination. Take a moment to sit back and sketch out the layout of your WEB DESIGN. People are ready to get impressed!\n");
                description1.setText("\nAnyone with a valid college identity card can participate.\n" +
                        "No Member can be part of more than one team.\n" +
                        "Team Members need not be from the same college/institute.\n" +
                        "Decisions made by the Judges will be final\n");
                details.setText("\nRound 1 - Written (MCQ)\n" +
                        "Round 2 - Practical - UI Design \n");
                organizer.setText("\nkrithiga R +918870781476\n");
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==7)
            {
                image.setBackgroundResource(R.drawable.olpc);
                title.setText("OLPC");
                description.setText("\nAlgorithm is our anthem,C is our bible,SPOJ is our temple ,Coding is our profession,We are the big league,Called as GEEKS!\n");
                description1.setText("\nAnyone with a valid college identity card can participate.\n" +
                        "No Member can be part of more than one team.\n" +
                        "Team Members need not be from the same college/institute.\n" +
                        "Decisions made by the Judges will be final\n");
                details.setText("\nOnly 1 round - Online\n\n");
                organizer.setText("\nWill be updated soon\n");
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==8)
            {
                image.setBackgroundResource(R.drawable.juggernaut);
                title.setText("JUGGERNAUT");
                description.setText("\nHide not your talents,For concealed talent brings no reputation, What is a sundial in the shade? Do not dole it out like a miser! A smooth sea never made a skilled sailor! Here is CSMIT presenting you a platform to rise above the storm and spend your talents lavishly!\n");
                description1.setText("\nAnyone with a valid college identity card can participate.\n" +
                        "No Member can be part of more than one team.\n" +
                        "Team Members need not be from the same college/institute.\n" +
                        "Decisions made by the Judges will be final\n");
                details.setText("\nSeparate rounds for each stream students\n");
                organizer.setText("\nNavaneetha Krishnan\n");
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
            return 8;
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
                case 5:
                    return "6";
                case 6:
                    return "7";
                case 7:
                    return "8";
            }
            return null;
        }
    }
}
