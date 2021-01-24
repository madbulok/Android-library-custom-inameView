# UserCustomImageView
 
 <h1>Setup</h1>
 
 Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
 
 
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.madbulok:Android-library-custom-inameView:$versionLibrarry'
	}
 
 
 <h1>Usage.</h1>
 
 In your layout.xml:
 
         <com.uzlov.workbook.customview.view.UserCustomImageView
        android:id="@+id/customViewAvatar"
        android:layout_width="200dp"
        android:layout_height="200dp"
        android:layout_marginTop="8dp"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/button"
        app:piv_borderColor="@color/colorPrimaryDark"
        app:piv_borderWidth="3dp"
        app:piv_animationInterpolator="DecelerateInterpolator"
        app:piv_initial="@string/app_name"
        app:piv_valueOfIncrease="350"
        app:piv_valueOfSpeedAnimation="100" />
 
In the code to insert an image, you must run:

    customViewAvatar.setImageDrawable(drawable = getDrawable(R.drawable.YOUR_DRAWABLE))
    
If you using Picasso library:
        
	Picasso.get()
            .load(R.drawable.YOUR_DRAWABLE)
            .into(customViewAvatar)

Method for setting the value by which the view will be increased during animation

    customViewAvatar.setValueOfIncrease(400)
    
Method for setting the animation speed:

    customViewAvatar.setValueOfSpeedAnimation(200)
	
Support all standart listeners.

<h1>Result</h1>
<img src="https://krotty.ru/1.gif" width="360" height="780" />
