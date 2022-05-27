# JavaCalculator

This is our Java calculator which includes the following functionalities: 

- limit calculator
- derivative at a point
- definite & improper integrals
- graphing
- series 
- statistics functions (significance tests, linear regression, etc.) 
- and other various calculations... 

Here are some screenshots of our UI for the calculator: 

<p align="center">
  <img src="images/ss1.png" width="570">
</p>
<p align="center">
  <img src="images/ss2.png" width="570">
</p>
<p align="center">
  <img src="images/ss3.png" width="570">
</p>
<p align="center">
  <img src="images/ss4.png" width="570">
</p>
<p align="center">
  <img src="images/ss5.png" width="570">
</p>
<p align="center">
  <img src="images/ss6.png" width="570">
</p>

## Function Class 
The <samp>Function</samp> class defines all functions used for computations and other mathematical methods in binary pairs. On input, all functions are simplified to multiple <samp>Function</samp> objects that contain each other so that large functions can be simplified into binomial or monomial expressions. This creates a virtually recursive system since each function can invoke the <samp>compute()</samp> method on its parameters, which will then compute there parameters, and so on and so forth. This means that all variables, numbers, operations, and functions are stored as <samp>Function</samp> objects, making parsing from Reverse Polish Notation to a <samp>Function</samp> object very easy. The <samp>Function</samp> class also remembers all computations that it performs, so if the <samp>Function</samp> is computed at a certain point, it will simply return the previously calculated value without recalculating the value in order to save time.
