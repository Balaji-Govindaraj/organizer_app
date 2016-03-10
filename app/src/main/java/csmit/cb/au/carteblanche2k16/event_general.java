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

public class event_general extends AppCompatActivity {

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
        toolbar.setTitle("General Events");
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
                image.setBackgroundResource(R.drawable.gaming);
                title.setText("GAMING");
                description.setText("\nIt is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters.\n");
                description1.setText("\n-\n");
                details.setText("\n-\n");
                organizer.setText("\n-\n");
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==2) {
                image.setBackgroundResource(R.drawable.gq);
                title.setText("GENERAL QUIZ");
                description.setText("\nIt is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters.\n");
                description1.setText("\n-\n");
                details.setText("\n-\n");
                organizer.setText("\n-\n");
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==3) {
                image.setBackgroundResource(R.drawable.ipl);
                title.setText("IPL AUCTION");
                description.setText("\nIPL AUCTIONS is a combination of cricketing knowledge and managerial skills.The prelims will be a cricket quiz with a combination of easy ,medium and hard level questions.With the hard questions given some extra weightage in marks calculation.The top 8 teams will be selected for the finals.Finals will be conducted in a similar way to the actual IPL auctions. The 8 teams will be provided a fixed budget and a list of players who will be put up for auction. As the auction proceeds teams can bid for any player of their choice and try to buy him. At the end of the auction the teams picked by the contestants will be evaluated based on the common criteria used to judge teams in cricket. (squad balance, individual player contributions, team chemistry) etc and a winner will be picked.\n");
                description1.setText("\n-\n");
                details.setText("\n-\n");
                organizer.setText("\n-\n");
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==4) {
                image.setBackgroundResource(R.drawable.hackathon);
                title.setText("HACKATHON");
                description.setText("\nIt is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters.\n");
                description1.setText("\n-\n");
                details.setText("\n-\n");
                organizer.setText("\n-\n");
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==5) {
                image.setBackgroundResource(R.drawable.hsw);
                title.setText("HOW STUFF WORKS");
                description.setText("\nIt is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters.\n");
                description1.setText("\n-\n");
                details.setText("\n-\n");
                organizer.setText("\n-\n");
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==6) {
                image.setBackgroundResource(R.drawable.ip);
                title.setText("IDEA PRESENTATION");
                description.setText("\nIt is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters.\n");
                description1.setText("\n-\n");
                details.setText("\n-\n");
                organizer.setText("\n-\n");
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==7) {
                image.setBackgroundResource(R.drawable.mom);
                title.setText("MATH O MANIA");
                description.setText("\nAre you dominated by an insatiable curiosity to fight against the odds? Calling all those polymaths and philomaths out there! Anything and everything on math! Its time to sharpen your mind and crack the puzzles to become unsurpassed master of queen of sciences. Accept your limits and go beyond them! After all math is fun.\n");
                description1.setText("\nAnyone with a valid college identity card can participate.\n" +
                        "No Member can be part of more than one team.\n" +
                        "Team Members need not be from the same college/institute.\n" +
                        "Decisions made by the Judges will be final\n");
                details.setText("\nRound 1 - Written\n" +
                        "Round 2 - Finale\n\n");
                organizer.setText("\nMytheri +91 9884282395\n\n");
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==8) {
                image.setBackgroundResource(R.drawable.pp);
                title.setText("PAPER PRESENTATION");
                description.setText("\nTopics from all streams are welcomed. Send Your abstract to paper_presentation@csmit.org\n");
                description1.setText("\nThe abstract & paper should be in IEEE Format\n" +
                        "Mail in your entries to paper_presentation@csmit.org by 10th March 2016, If your abstract is selected, you will be intimated by 15th Mar 2016.\n" +
                        "Organizers decision is final.\n");
                details.setText("\nRound 1 - Screening\n" +
                        "Round 2 - Presentation\n");
                organizer.setText("\nWill be updated soon\n");
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==9) {
                image.setBackgroundResource(R.drawable.th);
                title.setText("TREASURE HUNT");
                description.setText("\nIt is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters.\n");
                description1.setText("\nDetails of Event goes here\n");
                details.setText("\nOrganiser Details\n");
                organizer.setText("\nVenue Details\n");
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
            return 9;
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
            }
            return null;
        }
    }
}
