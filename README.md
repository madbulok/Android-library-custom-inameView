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
	        implementation 'com.github.madbulok:Android-library-custom-inameView:Tag'
	}
 
 
 <h1>Usage.</h1>
 
 In your layout.xml:
 
     <com.uzlov.workbook.customview.view.UserCustomImageView
        android:id="@+id/customViewAvatar"
        android:layout_width="200dp"
        android:layout_height="200dp"
        android:src="@drawable/tarkov"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:piv_borderColor="@color/colorPrimaryDark"
        app:piv_borderWidth="3dp"
        app:piv_initial="@string/app_name"
        app:piv_valueOfIncrease="350"
        app:piv_valueOfSpeedAnimation="100" />
 
In the code to insert an image, you must run:

    customViewAvatar.setImageDrawable(drawable = getDrawable(R.drawable.YOUR_DRAWABLE))

Support all standart listeners.

<h1>Result</h1>
<img src="https://krotty.ru/1.gif" width="360" height="780" />
