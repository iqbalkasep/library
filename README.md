#How to Install to your projects

Open your root build.gradle and add "maven { url "https://jitpack.io" }" as code below

allprojects {
    repositories {
        maven { url "https://jitpack.io" }
        jcenter()
    }
}

Then add compile 'com.github.iqbalkasep:library:1.0.2' in your dependencies app build.gradle 



# ViewUtilities Class


You can use this library to set view become hide, visible and gone with simply way also can add or replace simple fragment (android.support.v4.app.Fragment).

Example :  

fragment : Fragment fragment = new TestFragment1();
fragmentManager : FragmentManager fragmentManager = getSupportFragmentManager();
int : R.layout.sample
true : addToBackStack(null);

ViewUtilities.addSimpleFragment(fragment, fragmentManager, R.id.container_activity_main_id, true);
ViewUtilities.replaceSimpleFragment(fragment, fragmentManager, R.id.container_activity_main_id, true);

ViewUtilities.setVisible(View...views);
ViewUtilities.setGone(View...views);
ViewUtilities.setInvisible(View...views);

#MovingAnimationDrawable Class

This class for animation purpose with xml drawable 







