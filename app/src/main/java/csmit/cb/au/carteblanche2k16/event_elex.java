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

public class event_elex extends AppCompatActivity {

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
        toolbar.setTitle("ELEX Events");
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
                image.setBackgroundResource(R.drawable.bitsandbytes );
                title.setText("BITS AND BYTES");
                description.setText("\nDo 0s and 1s fascinate you ? Then open the logic gates of \"BITS AND BYTES\" this Carte Blanche to show off the best of your skills.\n");
                description1.setText("\nAnyone with a valid college identity card can participate.\n" +
                        "No Member can be part of more than one team.\n" +
                        "Team Members need not be from the same college/institute.\n" +
                        "Decisions made by the Judges will be final\n");
                details.setText("\nRound 1 - Written\n" +
                        "Round 2 - Digital Design\n");
                organizer.setText("\nTHirunavkarasu-9003226813\n" +
                        "kannan-9788072878\n");
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==2) {
                image.setBackgroundResource(R.drawable.bugwar);
                title.setText("BUG WAR");
                description.setText("\nAre you one who thinks there is no digital without analog? Are you the one who loves the linear range more than on and off? Here is the stage to showcase your talent....\n");
                description1.setText("\nAnyone with a valid college identity card can participate.\n" +
                        "No Member can be part of more than one team.\n" +
                        "Team Members need not be from the same college/institute.\n" +
                        "Decisions made by the Judges will be final\n");
                details.setText("\nRound 1 - Written\n" +
                        "Round 2 - Practical\n");
                organizer.setText("\nsarath-9600257916\n" +
                        "Arjun-8870423719\n");
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==3) {
                image.setBackgroundResource(R.drawable.chooseursim);
                title.setText("CHOOSE UR SIM");
                description.setText("\n\"Mind is a simulation that stimulates itself\" Design and verification of complex systems, have become an easy task, Thanks to the \"SIMULATORS\". Show us your technocratic brilliance, through various simulators, like MultiSim, MATLAB to meet the challenge that is in front of you..\n");
                description1.setText("\nAnyone with a valid college identity card can participate.\n" +
                        "No Member can be part of more than one team.\n" +
                        "Team Members need not be from the same college/institute.\n" +
                        "Decisions made by the Judges will be final\n");
                details.setText("\nRound 1 - Written\n" +
                        "Round 2 - Practical\n");
                organizer.setText("\nGurucharan-9488823020\n" +
                        "yuvaraj-9688829166\n");
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==4) {
                image.setBackgroundResource(R.drawable.electrocute);
                title.setText("ELECTROCUTE");
                description.setText("\nHow fascinating it is to design your ideas, develop a model, give a life to your imagination. We let you experience the godly feel where you can design and develop Analog and Digital systems..\n");
                description1.setText("\nAnyone with a valid college identity card can participate.\n" +
                        "No Member can be part of more than one team.\n" +
                        "Team Members need not be from the same college/institute.\n" +
                        "Decisions made by the Judges will be final\n");
                details.setText("\nRound 1 - Written\n" +
                        "Round 2 - Practical\n");
                organizer.setText("\nvidhyaprasand-9500885859\n");
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==5) {
                image.setBackgroundResource(R.drawable.instru);
                title.setText("INSTRU");
                description.setText("\nInnovations are nothing without experiments, Experiments are nothing without measurements and results. Engineers and techies, here is your chance to measure and analyse the control systems. You can manipulate, measure and analyse the control systems here at \"INSTRU\".\n");
                description1.setText("\nAnyone with a valid college identity card can participate.\n" +
                        "No Member can be part of more than one team.\n" +
                        "Team Members need not be from the same college/institute.\n" +
                        "Decisions made by the Judges will be final\n");
                details.setText("\nRound 1 - Written\n" +

                        "Round 2 - Seminar and Written\n");
                organizer.setText("\nNanjayan-814661275\n");
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==6) {
                image.setBackgroundResource(R.drawable.mupro);
                title.setText("Mu Pro");
                description.setText("\nWelcome to the digital world, to the new era, of integrated electronics, where microprocessors are embedded, for the computers are expensive. It takes innate knowledge and expertise, to unravel the mystery of the land and to reach the ultimate quest..\n");
                description1.setText("\n-\n");
                details.setText("\n-\n");
                organizer.setText("\n-\n");
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==7) {
                image.setBackgroundResource(R.drawable.imageedit);
                title.setText("NET CRACKER");
                description.setText("\nCome with us, For the roller-coaster ride, Of tangled missions, never ending maze, where only your networking knowledge, guides you out, to the ultimate destination..\n");
                description1.setText("\nAnyone with a valid college identity card can participate.\n" +
                        "No Member can be part of more than one team.\n" +
                        "Team Members need not be from the same college/institute.\n" +
                        "Decisions made by the Judges will be final\n");
                details.setText("\nRound 1 - Written\n" +

                        "Round 2 - Practical \n");
                organizer.setText("\nBhavanachandra-9092759121\n" +
                        "Rajesh-9789363711\n");
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==8) {
                image.setBackgroundResource(R.drawable.numerique);
                title.setText("NUMERIQUE");
                description.setText("\nAre you the one, Who can conquer the land of 0s and 1s? Can you achieve an optimal circuit design, in the smallest space possible? We look for individual minds, who can play with bits and bytes, and shape good VLSI design. Kick off the battle and tune your mind to face the simplest as well as unimaginable scenarios!.\n");
                description1.setText("\nAnyone with a valid college identity card can participate.\n" +
                        "No Member can be part of more than one team.\n" +
                        "Team Members need not be from the same college/institute.\n" +
                        "Decisions made by the Judges will be final\n");
                details.setText("\nRound 1 - Written\n" +

                        "Round 2 - VLSI Design \n");
                organizer.setText("\nJanani-9566094592\n" +
                        "GAyathiri-9840040976\n");
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==9) {
                image.setBackgroundResource(R.drawable.pentrive);
                title.setText("PENTRIVE");
                description.setText("\nFor the virtuosos who want to tease their brains, or the shallow people, who believe only in fluke, here comes the competition, PENTRIVE..\n");
                description1.setText("\nAnyone with a valid college identity card can participate.\n" +
                        "No Member can be part of more than one team.\n" +
                        "Team Members need not be from the same college/institute.\n" +
                        "Decisions made by the Judges will be final\n");
                details.setText("\nRound 1 - Basic Electronics Questions (MCQ)\n" +
                        "Round 2 - Basic Electronics Questions\n");
                organizer.setText("\nJanani-9566094592\n" +
                        "GAyathiri-9840040976\n");
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==10) {
                image.setBackgroundResource(R.drawable.techmarathon);
                title.setText("TECH MARATHON");
                description.setText("\nNo patterns here , its for you to come and experience some questions that braintease you for a while , with more geeks sitting next to you , thinking hard to recall what they had read, sometime back ! Ready to face the challenge where being a Book Worm wont help ? Then walk in to display how spontaneous your thinking is , which will be worth spending your time off from other agenda !.\n");
                description1.setText("\nAnyone with a valid college identity card can participate.\n" +
                        "No Member can be part of more than one team.\n" +
                        "Team Members need not be from the same college/institute.\n" +
                        "Decisions made by the Judges will be final\n");
                details.setText("\nRound 1 - Written\n" +

                        "Round 2 - Will be disclosed Onspot \n");
                organizer.setText("\nAdithya-8939779069\n" +
                        "vinesh-9600071687\n");
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
            return 10;
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
                case 8:
                    return "9";
                case 9:
                    return "0";
            }
            return null;
        }
    }
}
