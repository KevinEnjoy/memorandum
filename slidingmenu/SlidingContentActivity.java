package com.example.slidingmenu_kevin;

import android.os.Bundle;

/**
 * @author KevinWen
 *
 */
public class SlidingContentActivity extends BaseSlidingMenuActivity {
	
	public SlidingContentActivity() {
		super(R.string.title_bar_content);
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// set the Above View
		setContentView(R.layout.activity_sliding_content);
		
		/**
		 * ÄÚÈÝÒ²ÓÃListFragment
		getSupportFragmentManager()
		.beginTransaction()
		.replace(R.id.content_frame_test, new TestListFragment())
		.commit();
		 */
		
		setSlidingActionBarEnabled(false);
	}

}
