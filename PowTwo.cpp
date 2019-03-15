#include <iostream>
#include <iomanip>
#include <string>
using namespace std;

/*Given an integer, write a function to determine if it is a power of two.
 */
bool PowTwo(int);

int main() {
    std::cout << PowTwo(218) << '\n';
}

bool PowTwo(int input) {
    if (input == 1) {
        return true;
    }
    double result = double(input);
    while (true) {
        result = result / 2;
        if (result < 2) {
            break;
        }

    }
    if (result == 1) {
        return true;
    }
    else {
        return false;
    }
}
