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

public class event_robotics extends AppCompatActivity {

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
        toolbar.setTitle("Robotics Events");
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
                image.setBackgroundResource(R.drawable.robowars);
                title.setText("ROBO WARS");
                description.setText("\nAll across the world, camaraderie is the word. Nevertheless, a war, I would say is always interesting.(No offence though! ) Well, having set your feet in the world of robotics, there is a kingdom to conquere before you set the next step. Here we present to you the battlefield. Make your creation the hero of the warfare. Get ready to hoist your flag ! The war... begins....\n");
                description1.setText("\nAnyone with a valid college identity card can participate.\n" +
                        "No Member can be part of more than one team.\n" +
                        "Team Members need not be from the same college/institute.\n" +
                        "Decisions made by the Judges will be final\n");
                details.setText("\nRound 1 - Screening\n" +
                        "Round 2 - Finale\n" +
                        "Venue\n" +
                        "OAT\n");
                organizer.setText("\nNaveen-(+91)8056685401\n\n");
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==2)
            {
                image.setBackgroundResource(R.drawable.robos);
                title.setText("ROBO Soccer");
                description.setText("\nAmidst the mundane lives, where we get chances to rejoice soccer only on the television, we are taking you a few steps away from your couch. The live soccer is here... Like the game, we have crowd, we have rules, we have awards to give. We bet this is gonna be a lively and a fun-packed episode. Our green grass awaits...\n");
                description1.setText("\nAnyone with a valid college identity card can participate.\n" +
                        "No Member can be part of more than one team.\n" +
                        "Team Members need not be from the same college/institute.\n" +
                        "Decisions made by the Judges will be final\n");
                details.setText("\nRound 1 - Screening\n" +
                        "Round 2 - Finale\n" +
                        "Venue\n" +
                        "OAT\n");
                organizer.setText("\nManmadhan-(+91)9952096707\n");
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==3)
            {
                image.setBackgroundResource(R.drawable.lf);
                title.setText("LINE FOLLOWER");
                description.setText("\nWell, an 'Old is Gold' one, 'Classic' and 'Inevitable' too. No robotics world is complete without this entity. The title stands for itself -- Follow the line and the rewards follow you. Never be guiled by the easeness that the title beholds. No, it's not that simple ! Be prepared for the world of terrible obstacles. Oh come on, winning has never ever been compromised !\n");
                description1.setText("\nAnyone with a valid college identity card can participate.\n" +
                        "No Member can be part of more than one team.\n" +
                        "Team Members need not be from the same college/institute.\n" +
                        "Decisions made by the Judges will be final\n");
                details.setText("\nRound 1 - Screening\n" +
                        "Round 2 - Finale\n" +
                        "Venue\n" +
                        "OAT\n");
                organizer.setText("\nChandrasekar-(+91)9994642449\n");
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==4)
            {
                image.setBackgroundResource(R.drawable.at);
                title.setText("ALL TERRAIN");
                description.setText("\n-\n");
                description1.setText("\nAnyone with a valid college identity card can participate.\n" +
                        "No Member can be part of more than one team.\n" +
                        "Team Members need not be from the same college/institute.\n" +
                        "Decisions made by the Judges will be final\n");
                details.setText("\nRound 1 - Screening\n" +
                        "Round 2 - Finale\n" +
                        "Venue\n" +
                        "OAT\n");
                organizer.setText("\nSankara Narayanan-(+91)8681800377\n");
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
