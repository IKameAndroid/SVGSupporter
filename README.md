# SVGSupporter

allprojects {
		repositories {
			maven { url 'https://jitpack.io' }
		}
	}
  
  dependencies {
	        compile 'com.github.IKameAndroid:SVGSupporter:-SNAPSHOT'
	}
	
	
	
       <com.example.svgsupporter.richpath.SVGImageView
            android:id="@+id/love_face"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="4dp"
            android:padding="8dp"
            android:onClick="animateLoveFace"
            app:vector="@drawable/face_love" />
	    
	    
	     final RichPath rEye = loveFaceSVGImageView.findRichPathByName("r_eye");
        final RichPath lEye = loveFaceSVGImageView.findRichPathByName("l_eye");

        rEye.setPivotToCenter(true);
        lEye.setPivotToCenter(true);
	    
	    
	     RichPathAnimator
                .animate(rEye, lEye)
                .interpolator(new LinearInterpolator())
                .duration(800)
                .repeatMode(RichPathAnimator.RESTART)
                .repeatCount(RichPathAnimator.INFINITE)
                .scale(1, 0.9f, 1.07f, 1)
                .fillColor(0XFFF52C5B, 0xFFF24976, 0XFFD61A4C, 0XFFF52C5B)
                .start();
