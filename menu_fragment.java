import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public class MenuScreen extends Fragment {
  
    private String menuText;
  
    public static MenuScreen newInstance(String menuText) {
        MenuScreen fragment = new MenuScreen();
        this.menuText = menuText;
        return fragment;
    }
     
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable
                     ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView tv = new TextView(this);
        tv.setText(menuText);
        return tv;      
    } 
  
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle(menuText);
    }
}
