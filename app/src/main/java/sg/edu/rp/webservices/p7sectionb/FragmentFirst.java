package sg.edu.rp.webservices.p7sectionb;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentFirst extends Fragment {

TextView tvFrag1;
Button btnFrag1;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        tvFrag1 = view.findViewById(R.id.tvFrag1);
        btnFrag1 = view.findViewById(R.id.btn1);

        btnFrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = tvFrag1.getText().toString() + "\n" + "New Data F1";
                tvFrag1.setText(data);
            }
        });

        return view;
    }
}
