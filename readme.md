# The process is simple:

  - Just clone the repository
  - Run the evaluate.java class

The Algorithm used is Random Forest.

This works with a Python Script wich generates a code in Java from the generated tree of Weka.

See [pielot.org](http://pielot.org/2015/06/exporting-randomforest-models-to-java-source-code/) to know how this works in details.


**But basically**
The output from the randomforst with the training data is saved into a plaintext file, which is then read from the Python file wich takes the structure of the tree from the txt and generate a JavaClass which has this decision tree formed as ifs functions.

**How to use it**
Simply fill the console inputs as they are requested.

Implemented to be part of the Practice #1 of Data Mining, as we were required to do a method using one of the techniques learned ( Bayes, Regression, Neuronal Networks, ... ) how to predict the religion of a country given its flag description.

We did not programmed the tool, we just used it from the link that was shown before.
We only did the Java Interface ( Very simple ) to read the data from console, and the training in weka to obtain the txt.


Oasting Ferrera. 2012-2051.
César Méndez. - 2013-0262.


And Thanks to PieLot ( https://github.com/mpielot/androidrf ) for providing such a useful tool, and Dillinger ( http://dillinger.io/ ) that was the tool used to make the ReadMe.