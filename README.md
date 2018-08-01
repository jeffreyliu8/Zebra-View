# Zebra-View


[![License](https://img.shields.io/badge/license-Apache%202-blue.svg)](https://www.apache.org/licenses/LICENSE-2.0)
[![Release](https://jitpack.io/v/jeffreyliu8/Zebra-View.svg)](https://jitpack.io/#jeffreyliu8/Zebra-View)


A simple library view for showing 45 degree tilted strips.

Customization
----------------
The 2 colors and width. 

Todo
----------------
Angles, number of strips, 


Using ZebraView
----------------

### Setup
```groovy
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```


##### Dependencies
```groovy
	dependencies {
	        compile 'com.github.jeffreyliu8:Zebra-View:v0.0.5'
	}
```

A quick example is shown below:

```xml
    <com.askjeffreyliu.zebraview.ZebraView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:barWidth="36dp"
        app:color1="@color/colorAccent"
        app:color2="@color/colorPrimaryDark"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
```

![Output sample](https://github.com/jeffreyliu8/Zebra-View/blob/master/screenshot.png)

Requirements
--------------
Requires a minimum SDK version of 14
