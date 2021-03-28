# Viewmodel

    // - - ViewModel and LiveData
    def lifecycle_version = "2.2.0"
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
    implementation "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"


Livedata vs Mutable livedata:
Use LiveData when you don't want to modify it because the methods like setValue() & postValue() are not public . Live data takes care itself by calling them internally. Where as in MutableLiveData setValue() postValue() are exposed ie public. You can change set values by calling these methods
