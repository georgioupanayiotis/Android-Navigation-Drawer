@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
 
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, 
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
 
        NavigationView navigationView = (NavigationView) 
                                        findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
 
        if (savedInstanceState == null) {
            EmployeeFragmentFragment employeeFragmentFragment =  
                                             new EmployeeFragmentFragment();
            FragmentTransaction ft = getSupportFragmentManager()
                                                         .beginTransaction();
            ft.add(R.id.content_frame, employeeFragmentFragment).commit();
        }
}   
