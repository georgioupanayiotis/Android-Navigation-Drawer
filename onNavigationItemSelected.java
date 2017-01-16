@SuppressWarnings("StatementWithEmptyBody")
 @Override
 public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
         
        MenuFragment menuFragment = null;
 
        if (id == R.id.nav_camera) {
            menuFragment = MenuFragment.newInstance("Menu 1");          
        } else if (id == R.id.nav_gallery) {
            menuFragment = MenuFragment.newInstance("Menu 2");      
        } else if (id == R.id.nav_slideshow) {
            menuFragment = MenuFragment.newInstance("Menu 3");      
        } else if (id == R.id.nav_manage) {
            menuFragment = MenuFragment.newInstance("Menu 4");      
        } else if (id == R.id.nav_share) {
            menuFragment = MenuFragment.newInstance("Menu 5");      
        } else if (id == R.id.nav_send) {
            menuFragment = MenuFragment.newInstance("Menu 6");      
        }
         
        // replacing the fragment
        if (menuFragment != null) {
            FragmentTransaction ft = getSupportFragmentManager()
                                             .beginTransaction();
            ft.replace(R.id.content_frame, fragment).commit();
        }
 
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
}
