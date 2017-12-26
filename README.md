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


Using NFSD
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
	        compile 'com.github.jeffreyliu8:Zebra-View:v0.0.3'
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

Developed By
-------
Jeffrey Liu - <jeffreyliu8@gmail.com>

<a href="https://www.linkedin.com/in/jeffrey-liu-08a0b936">

License
-------

    Copyright 2017 Jeffrey Liu

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
