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

public class event_online extends AppCompatActivity {

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

        toolbar.setTitle("Online Events");
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
            TextView description1=(TextView)rootView.findViewById(R.id.description);
            if(getArguments().getInt(ARG_SECTION_NUMBER)==1) {
                image.setBackgroundResource(R.drawable.metagrobalize);
                title.setText("METAGROBALISE");
                description.setText("\nMetagrobolize is a stage (virtual) to showcase the prowess of your brain. Join here and let your analytical thinking go crazy as you battle through a number of tricky, logical and technical questions that will confound the simple brain. An array of questions whose answer needs to be derived from logic or well known (googled) facts are waiting for you. Come and see if you're up to it. Everyone else is your opponent and time isn't on your side. Can you survive to make it to the top, or will you fall disgracefully?\n");
                description1.setText("\nOnly one answer is the correct answer!\n" +
                        "The answer format is always in small case,and does not contain any spaces or special characters\n" +
                        "Fully of Mathematics\n" +
                        "The admin's decision will be final in case the need arises\n");
                details.setText("\nRound Details\n" +
                        "ONLINE\n" +
                        "Stay updated with our FB page for further details\n");
                organizer.setText("\nWill be updated soon.\n");
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==2)
            {
                image.setBackgroundResource(R.drawable.trapped);
                title.setText("TRAPPED");
                description.setText("\nA battle lies within what is the most resilient parasite in the world?? A bacteria? A virus? An Unsolved Puzzle! Once you plant a puzzle in some ones mind, until he knows the answer, it sits there. The more the tougher one is, the stronger is the parasite.. Trapped offers you the opportunity of getting trapped inside the infinite world of internet and your consciousness. Your treasure awaits you at the end. You're supposed to find your way out, but there's always catch.. Not everyone can make it.. Unlike other hunts you're not going to play against others. You're going to gamble against your own wits.. The winner gets the treasure but beware! the trapped grow old men filled with regret. Enter at your own risk. The Battle lies within.\n");
                description1.setText("\nOnly one answer is the correct answer!\n" +
                        "The answer format is always in small case,and does not contain any spaces or special characters\n" +
                        "Look for clues on Title, Page Source,URL,Cookies and the website\n" +
                        "The admin's decision will be final in case the need arises\n");
                details.setText("\nRound Details\n" +
                        "ONLINE\n" +
                        "Stay updated with our FB page for further details\n");
                organizer.setText("\nWill be updated soon.\n");
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
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "1";
                case 1:
                    return "2";
            }
            return null;
        }
    }
}
