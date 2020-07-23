#===================================#
# More Math / operations practice
#
# READ HERE for helpful math programming tips
# 
# To access PI: math.pi
#
# To use exponents: pow(a, b) --> raises a to the b power
# 
# To find absolute value: abs(number) ----> example: abs(2 - 5) returns 3
# 
# To find the greater of two values: max(a, b)
#
# To find the lesser of two values: min(a, b)
#
# To find the square root of a value: either use pow(number, 0.5) or math.sqrt(number)
#
# by Jack Donofrio
#===================================#

# this import below allows us to access some useful math functions
# https://docs.python.org/3/library/math.html  <-- read more about the math package here
import math


# circumference = 2 * pi * radius
def circumference(radius):
    return 0

# circle area = radius^2 * pi
def circle_area(radius):
    return 0

# degrees = radians * 180 / pi
def radians_to_degrees(radians):
    return 0

# Area of a triangle = base * height / 2
def triangle_area(base, height):
    return 0

# Given legs a, b, find find hypotenuse c
# c = square root of (a^2 + b^2)
def pythagorean_theorem(a, b):
    return 0

# (This next problem comes from something we'll work with when using a particular sensor with Arduino boards)
#
# Imagine you have a speaker and a microphone side by side.
# The speaker shoots out sound-waves (noise) which hit a wall and then reflect back to the microphone.
# This is shown in the diagram below:
#
# S = speaker
# M = microphone
# Arrows = sound waves
# |||||||||
# |       |
# |S ---->|
# |M <----|
# |       |
# |||||||||
#
# Given:
#      Speed of sound = 343 meters / second
#      Time (seconds) between speaker releasing sound and mic picking it up = time
#      Distance = speed * time
#
# Find the distance from the speaker/microphone setup to the wall
#
# Hint: think about what the 'time' variable really represents, as described above
# and how it relates to the formula, distance = speed * time
def distance(time):
    return 0

# Given two coordinates, (x1, y1) and (x2, y2), write a function that returns
# the area of the smallest possible square that encloses both coordinates
#
# Example 1 ->
#         Given coordinates (1, 3) and (5, 9)
#         Minimum square area = 36
# Example 2 ->
#         (5, 2) and (9, 1)
#         Minimum square area = 16
#
# Hint: graphing the coordinates out, perhaps on something like desmos.com, will help you
# visualize what you are actually trying to do here.
def minimum_area(x1, y1, x2, y2):
    return 0


## Tests ##


def circumference_test():
    assert(12.566 == round(circumference(2), 3))
    assert(43.982 == round(circumference(7), 3))
    assert(87.965 == round(circumference(14), 3))

def circle_area_test():
    assert(12.566 == round(circle_area(2),3))
    assert(113.097 == round(circle_area(6), 3))

def radians_to_degrees_test():
    assert(180 == radians_to_degrees(math.pi))
    assert(90 == radians_to_degrees(math.pi / 2))
    assert(45 == radians_to_degrees(math.pi / 4))

def triangle_area_test():
    assert(6 == triangle_area(3, 4))
    assert(12 == triangle_area(4, 6))
    assert(14 == triangle_area(4, 7))

def pythagorean_theorem_test():
    assert(5 == pythagorean_theorem(3, 4))
    assert(13 == pythagorean_theorem(12, 5))
    assert(10 == pythagorean_theorem(6, 8))

def distance_test():
    assert(857.5 == distance(5))
    assert(8.575 == distance(0.05))
    assert(1.715 == distance(0.01))

def minimum_area_test():
    assert(36 == minimum_area(1, 3, 5, 9))
    assert(16 == minimum_area(5, 2, 9, 1))
    assert(25 == minimum_area(4, 7, 6, 12))

try:
    circumference_test()
    print("Passed circumference")
except:
    print("Failed circumference")

try:
    circle_area_test()
    print("Passed circle area")
except:
    print("Failed circle area")

try:
    radians_to_degrees_test()
    print("Passed radians to degrees")
except:
    print("Failed radians to degrees")

try:
    triangle_area_test()
    print("Passed triangle area")
except:
    print("Failed triangle area")

try:
    pythagorean_theorem_test()
    print("Passed pythagorean theorem")
except:
    print("Failed pythagorean theorem")

try:
    distance_test()
    print("Passed distance")
except:
    print("Failed distance")

try:
    minimum_area_test()
    print("Passed minimum area")
except:
    print("Failed minimum area")