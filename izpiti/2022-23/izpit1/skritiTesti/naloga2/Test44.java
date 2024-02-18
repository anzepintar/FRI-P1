
import java.util.*;

public class Test44 {

    public static void main(String[] args) {
        final char[][] B01 = {
            {'m', 'p', 'a', 'h', 't', 'x', 'g', 'b', 'c'},
            {'z', 'z', 's'},
            {'c', 'a', 'i', 'i', 'w', 'u', 'z', 't', 'm'},
            {'l', 'b', 'g', 'a', 'n', 'u', 'm'},
            {'q', 'o', 'k', 'f', 'm'},
            {'c', 'a', 'c', 'a', 'i', 'i'},
            {'e', 'd', 'j', 'p', 'i', 'm', 'm'},
            {'n', 'b', 'z', 'i', 'h'},
            {'u', 'j', 'e', 'd', 'j'},
            {'m', 'o', 'e'},
            {'i', 'o', 'j', 'g', 'e', 'y', 'd'},
            {'a', 'q', 'j', 'o', 'o', 'p'},
            {'a', 'n', 'q'},
            {'o', 'd', 'l'},
            {'x', 'n', 'b'},
            {'d', 'x', 'n', 'w', 'v'},
            {'y', 'b', 'd', 'p', 'k', 'c', 'l', 'l'},
            {'o', 'u'},
            {'o', 'w', 'o', 'h', 'm', 'n', 'z', 'z'},
            {'n', 'w', 'v', 'f', 'h', 'f', 'l'},
            {'y', 'm', 'e', 'b', 'o', 'x', 'i'},
            {'e', 'e', 'a', 'n', 'g', 'j', 'm', 'o', 'e'},
            {'l', 'q'},
            {'o', 'j', 'n'},
            {'o', 'h', 'm'},
            {'o', 'j', 'g', 'e'},
        };

        final char[][] P01 = {
            {'5', '3', 'n'},
            {'8', '0', 'n'},
            {'7', '2', 'n'},
            {'4', '7', 'n'},
            {'4', '8', 'v'},
            {'5', '2', 'n'},
            {'2', '7', 'v'},
            {'6', '9', 'v'},
            {'2', '5', 'v'},
            {'3', '8', 'v'},
            {'0', '6', 'n'},
            {'0', '9', 'n'},
            {'7', '7', 'v'},
            {'7', '5', 'n'},
            {'6', '8', 'v'},
            {'5', '8', 'n'},
            {'5', '6', 'v'},
            {'5', '1', 'n'},
            {'2', '0', 'n'},
            {'7', '8', 'n'},
            {'0', '0', 'v'},
            {'3', '2', 'v'},
            {'4', '7', 'v'},
            {'1', '6', 'v'},
            {'4', '0', 'n'},
            {'1', '6', 'n'},
        };

        final char[][] B02 = {
            {'r', 'p', 'j', 'u', 'm', 'c', 't'},
            {'c', 'k', 'w', 'a', 'z', 'o', 'k'},
            {'k', 's', 's', 'l', 'n', 'o', 'm', 'e'},
            {'k', 't', 'a', 'a', 'x', 'w', 'z', 'v'},
            {'q', 's', 'e', 'n', 's', 'b', 'x', 'f', 'p'},
            {'e', 'j', 's', 'j', 'n', 'n'},
            {'b', 'p', 'a', 'g', 'q', 'd'},
            {'o', 'b', 'c', 'c', 'i'},
            {'p', 'a', 'g', 'q', 'd', 'o', 'l'},
            {'n', 's', 'b', 'x', 'f', 'p'},
            {'k', 'y', 'w', 'o'},
            {'q', 'c', 'w'},
            {'o', 'h', 'd', 's', 'g'},
        };

        final char[][] P02 = {
            {'7', '9', 'n'},
            {'2', '3', 'v'},
            {'7', '8', 'n'},
            {'2', '9', 'v'},
            {'4', '6', 'v'},
            {'9', '6', 'v'},
            {'0', '6', 'n'},
            {'0', '5', 'v'},
            {'1', '6', 'n'},
            {'4', '9', 'v'},
            {'2', '4', 'n'},
            {'6', '1', 'v'},
            {'5', '4', 'v'},
        };

        final char[][] B03 = {
            {'l', 'm', 'v'},
            {'u', 'a', 'y'},
            {'k', 'k', 'w', 's', 'q', 'r', 'a', 'h', 'o'},
            {'c', 'r', 'c', 't'},
            {'q', 'z', 'h', 'd', 'd'},
            {'z', 'u', 'h', 'i'},
            {'y', 'b', 'd', 'm', 'z', 'b', 'o', 'd', 'p'},
            {'j', 'e', 'v', 'q'},
            {'g', 'o', 'd', 'y', 'b', 'd', 'm', 'z', 'b'},
            {'j', 'h', 't', 'b', 'n', 'f', 'p', 'g', 'h'},
            {'d', 'e', 'l'},
            {'n', 'f', 'g', 's', 'h', 'k', 'k'},
            {'p', 'v', 'o'},
            {'g', 's', 'g'},
            {'n', 'm'},
            {'o', 'o', 'a'},
            {'s', 'h', 'k', 'k', 'w', 's', 'q', 'r', 'a'},
            {'o', 'k'},
            {'g', 'l', 'm', 'v', 'h', 'w'},
            {'y', 'o', 'q', 'e', 'q', 'b', 'h', 'c'},
            {'s', 'p', 'z', 'q', 'i'},
            {'y', 'b', 'd'},
            {'j', 'p', 'n', 'j', 'x', 'h', 'v', 'v', 'g'},
            {'b', 'n', 'f', 'p', 'g', 'h', 'e', 'o'},
            {'g', 'l', 'm', 'v'},
            {'y', 'n'},
            {'m', 'z', 'b', 'o', 'd', 'p'},
            {'t', 'e'},
            {'i', 'm', 'g', 'b', 'd', 'j', 'r', 'c'},
            {'k', 'k', 'w', 's', 'q', 'r', 'a', 'h', 'o'},
            {'m', 'n', 'f', 'p', 'k'},
            {'m', 'l', 'q'},
            {'e', 'h', 'c', 'h', 'q', 'o', 'a'},
            {'a', 's'},
            {'o', 'd', 'p', 'l', 'a', 'h', 'b', 'c', 'z'},
            {'e', 'u', 't', 's', 'i', 'y', 'e', 'a', 'f'},
            {'b', 'n', 'w', 'x', 'a', 'h', 'r', 'g'},
            {'t', 'e', 'z', 'u', 'h', 'i', 'b'},
            {'t', 'n', 'h', 'u', 'm', 'h'},
            {'c', 'r', 'c', 't'},
            {'t', 'a'},
            {'b', 'n', 'f', 'p'},
            {'o', 'k'},
            {'w', 'b', 'n', 'w', 'x', 'a', 'h', 'r'},
            {'z', 'q', 'h', 'b', 'f', 'j', 'n'},
            {'n', 's', 't', 'b', 'h', 'n', 'e', 'b'},
            {'s', 'w'},
            {'q', 'z'},
            {'q', 'b', 'g', 'l'},
            {'n', 'r', 'n', 'f'},
            {'e', 'h', 'c', 'h'},
            {'n', 'f', 'g', 's', 'h', 'k', 'k', 'w', 's'},
            {'j', 'h', 't', 'b', 'n', 'f', 'p', 'g', 'h'},
            {'k', 'k', 'w', 's', 'q'},
            {'k', 'y', 'o', 'q', 'e', 'q', 'b'},
            {'n', 'b', 'e', 'g', 's', 'g', 's', 'j', 'x'},
            {'g', 's', 'h', 'k', 'k', 'w', 's', 'q'},
            {'c', 'f', 's', 'p', 'v', 'o', 'o', 'a'},
            {'b', 'f', 'h', 'u', 'b'},
            {'d', 'w', 't', 'n', 'h', 'u', 'm', 'h', 'h'},
            {'n', 'u', 'a', 'y', 'j', 'p', 'n'},
            {'n', 's', 'p', 'z', 'q'},
            {'e', 'z', 't', 'f', 'l'},
            {'n', 'f', 'g', 's', 'h', 'k'},
            {'o', 'd', 'y', 'b', 'd', 'm', 'z'},
            {'l', 'q', 'b', 'g', 'l', 'm', 'v'},
        };

        final char[][] P03 = {
            {'6', '6', 'v'},
            {'5', '0', 'n'},
            {'9', '5', 'n'},
            {'1', '2', 'n'},
            {'9', '8', 'n'},
            {'4', '9', 'n'},
            {'3', '7', 'n'},
            {'4', '8', 'n'},
            {'0', '7', 'n'},
            {'3', '4', 'n'},
            {'3', '6', 'n'},
            {'4', '5', 'n'},
            {'1', '5', 'v'},
            {'0', '5', 'v'},
            {'5', '1', 'n'},
            {'1', '7', 'v'},
            {'7', '5', 'n'},
            {'0', '0', 'v'},
            {'6', '5', 'v'},
            {'9', '6', 'v'},
            {'7', '5', 'v'},
            {'3', '7', 'n'},
            {'8', '0', 'n'},
            {'6', '4', 'n'},
            {'6', '5', 'v'},
            {'3', '7', 'v'},
            {'6', '7', 'n'},
            {'2', '9', 'n'},
            {'7', '9', 'v'},
            {'9', '5', 'n'},
            {'9', '1', 'v'},
            {'6', '1', 'v'},
            {'3', '9', 'v'},
            {'3', '1', 'n'},
            {'9', '7', 'n'},
            {'5', '8', 'v'},
            {'8', '2', 'n'},
            {'2', '9', 'n'},
            {'2', '9', 'v'},
            {'1', '2', 'n'},
            {'2', '1', 'n'},
            {'6', '4', 'n'},
            {'0', '0', 'v'},
            {'7', '2', 'n'},
            {'5', '3', 'n'},
            {'4', '0', 'v'},
            {'1', '4', 'n'},
            {'9', '8', 'n'},
            {'6', '3', 'v'},
            {'2', '5', 'n'},
            {'3', '9', 'v'},
            {'4', '5', 'n'},
            {'3', '4', 'n'},
            {'9', '5', 'n'},
            {'9', '5', 'v'},
            {'0', '2', 'v'},
            {'6', '5', 'n'},
            {'1', '2', 'v'},
            {'8', '3', 'v'},
            {'2', '7', 'v'},
            {'4', '0', 'n'},
            {'7', '4', 'v'},
            {'5', '2', 'v'},
            {'4', '5', 'n'},
            {'1', '7', 'n'},
            {'6', '2', 'v'},
        };

        final char[][] B04 = {
            {'q', 'l', 'r'},
            {'i', 'r', 'c', 'm', 'x', 'c', 'r', 'd'},
            {'v', 'k', 'i'},
            {'i', 'v', 'o', 'x', 'f', 'p', 'b', 'o'},
            {'g', 'n', 'p', 'o', 'u'},
            {'k', 'n', 'w', 'i'},
            {'d', 'l', 'e', 'l', 'n', 'z', 'g', 'a', 'k'},
            {'g', 'n', 'p', 'o', 'u', 'j', 'v', 't', 'h'},
            {'v', 'k', 'e'},
            {'k', 'h', 'z', 'm'},
            {'w', 't'},
            {'l', 'z', 'q', 'z', 'j', 'c', 'p', 'f', 'k'},
            {'c', 'q', 'v', 'd', 'p', 'w', 'k'},
            {'c', 'j', 'c', 'v', 'q', 'q', 'b', 'g'},
            {'t', 'j', 'x', 'e', 'r', 'f'},
            {'z', 'a', 'n', 'e', 'p', 'r', 'r', 'c', 'd'},
            {'m', 'k', 'l', 'm', 'z', 's'},
            {'w', 'm', 'o', 'c'},
            {'c', 's', 'q'},
            {'x', 'f', 'p', 'b'},
            {'o', 'r', 'o', 'q', 'u', 'h', 'k', 'b', 'u'},
            {'q', 'm', 'f', 'n', 'l', 'p', 'y'},
            {'q', 'u', 'h', 'k', 'b'},
            {'n', 'p', 'o'},
            {'b', 'k'},
            {'g', 'w', 'y', 'r', 'z', 'i', 'c', 'f', 'v'},
            {'k', 'n'},
            {'a', 'c'},
            {'p', 'g'},
            {'x', 'u', 'q', 'm', 'f', 'n', 'l', 'p', 'y'},
            {'l', 'm', 'z', 's', 'p', 'a'},
            {'q', 'i', 'v', 'r', 'a', 'k', 'k'},
            {'b', 'h', 'q'},
            {'l', 'f', 'k', 'a', 'c', 'f'},
            {'e', 'r', 'f', 'p'},
            {'y', 'b'},
            {'b', 'h', 'q'},
            {'q', 'b', 'g', 'f', 'a', 's', 'y'},
            {'r', 'f', 'p', 'g', 'x'},
            {'x', 'c', 'r', 'd', 'z', 'h', 'h', 'v', 'r'},
            {'k', 'y', 'b', 'b', 'h', 'q', 'g'},
            {'j', 'p', 'c', 'a', 'c', 'j', 'c', 'v'},
            {'k', 'l', 'm', 'z', 's', 'p'},
            {'c', 'd', 'g', 'o'},
            {'k', 'l', 'm'},
            {'f', 'd', 'a', 'n'},
            {'g', 'v', 'n'},
            {'q', 'v', 'w', 'z', 'c', 's', 'q', 'r'},
            {'a', 'k', 'n', 'w'},
            {'m', 'o', 'c', 'n', 't', 'y', 'l'},
            {'o', 'n', 'a', 'a', 'j', 't', 'd'},
            {'z', 'c', 's', 'q', 'r', 'x', 'w', 'g'},
            {'w', 'a', 'x'},
            {'x', 'g', 'w', 'y', 'r', 'z'},
            {'q', 'q', 'b', 'g'},
            {'a', 'k', 'w', 'x', 'c'},
            {'f', 'd', 'a'},
            {'e', 'c', 'z', 'a'},
            {'f', 'd', 'a', 'n', 's', 'h', 'g', 'k'},
            {'k', 'n', 'b'},
            {'c', 'j', 'c', 'v', 'q', 'q', 'b'},
            {'q', 'l', 'r', 'q', 'd'},
            {'e', 'c', 'z', 'a'},
            {'p', 'w', 'k', 'y', 'b', 'b', 'h'},
            {'c', 'f', 'd', 'a', 'n', 's', 'h', 'g', 'k'},
            {'z', 'm', 'r', 'i'},
            {'c', 'f', 'd'},
            {'p', 'f', 'k', 'w', 'i', 'd', 'u', 'u', 'h'},
            {'y', 'b'},
            {'e', 'c', 'z', 'a', 'n', 'e', 'p', 'r', 'r'},
            {'w', 'o', 'q', 'q', 'l', 'r', 'q'},
            {'t', 'y', 'l', 'j', 'g', 'r'},
            {'w', 't', 'k', 'x', 'e', 'r', 'f', 'p'},
            {'q', 'm', 'f', 'n', 'l', 'p', 'y', 'a', 'v'},
            {'v', 'w', 'z', 'c', 's', 'q', 'r', 'x'},
            {'w', 'o', 'q', 'q', 'l', 'r', 'q', 'd'},
            {'p', 'z', 'q', 'f', 'w'},
            {'z', 'q', 'z', 'j', 'c', 'p', 'f', 'k', 'w'},
            {'t', 'y', 'l', 'j', 'g', 'r', 't', 'e'},
            {'k', 'h', 'e', 'c', 'z', 'a', 'n', 'e'},
        };

        final char[][] P04 = {
            {'7', '8', 'n'},
            {'5', '6', 'n'},
            {'2', '5', 'n'},
            {'5', '6', 'v'},
            {'8', '1', 'n'},
            {'4', '2', 'v'},
            {'0', '3', 'n'},
            {'8', '1', 'n'},
            {'7', '7', 'n'},
            {'5', '1', 'v'},
            {'9', '3', 'v'},
            {'1', '3', 'v'},
            {'0', '0', 'v'},
            {'7', '4', 'v'},
            {'9', '4', 'v'},
            {'8', '2', 'n'},
            {'8', '6', 'v'},
            {'4', '4', 'n'},
            {'2', '8', 'v'},
            {'5', '9', 'v'},
            {'6', '5', 'v'},
            {'7', '9', 'n'},
            {'6', '8', 'v'},
            {'9', '1', 'n'},
            {'8', '5', 'n'},
            {'4', '7', 'v'},
            {'4', '2', 'v'},
            {'7', '3', 'v'},
            {'7', '1', 'n'},
            {'5', '9', 'n'},
            {'8', '8', 'v'},
            {'0', '1', 'n'},
            {'0', '9', 'v'},
            {'3', '3', 'v'},
            {'9', '7', 'v'},
            {'0', '7', 'v'},
            {'0', '9', 'v'},
            {'7', '9', 'v'},
            {'9', '8', 'v'},
            {'9', '6', 'n'},
            {'0', '6', 'v'},
            {'7', '0', 'v'},
            {'8', '7', 'v'},
            {'0', '0', 'n'},
            {'8', '7', 'v'},
            {'3', '8', 'v'},
            {'2', '0', 'v'},
            {'2', '4', 'v'},
            {'4', '1', 'v'},
            {'5', '4', 'n'},
            {'3', '0', 'n'},
            {'2', '7', 'v'},
            {'2', '6', 'n'},
            {'4', '6', 'v'},
            {'7', '8', 'v'},
            {'7', '3', 'n'},
            {'3', '8', 'v'},
            {'6', '2', 'n'},
            {'3', '8', 'v'},
            {'8', '3', 'v'},
            {'7', '4', 'v'},
            {'7', '8', 'n'},
            {'6', '2', 'n'},
            {'0', '4', 'v'},
            {'3', '7', 'v'},
            {'5', '3', 'v'},
            {'3', '7', 'v'},
            {'1', '9', 'v'},
            {'0', '7', 'v'},
            {'6', '2', 'n'},
            {'4', '8', 'n'},
            {'9', '4', 'n'},
            {'9', '3', 'v'},
            {'7', '9', 'n'},
            {'2', '5', 'v'},
            {'4', '8', 'n'},
            {'0', '4', 'n'},
            {'1', '4', 'v'},
            {'9', '4', 'n'},
            {'4', '2', 'n'},
        };

        final char[][] B05 = {
            {'t', 'h', 's', 't', 'g', 'v', 'b', 'o', 'h'},
            {'p', 'x'},
            {'v', 'e'},
            {'p', 'z', 'u', 'v', 'd', 'u'},
            {'h', 's', 'h', 'g', 'v', 'b'},
            {'t', 'i'},
            {'q', 'z', 'w', 'b', 'j', 'g', 'q', 'w', 'g'},
            {'d', 'h', 'q', 'h', 'y', 'e', 'l', 'u'},
            {'l', 'e', 'o', 's', 'e', 'g', 'l'},
            {'k', 'm', 'h', 'k', 'w'},
            {'t', 'i'},
            {'y', 'e', 'j', 'l'},
            {'o', 'd', 'e', 'u', 'r', 'y', 'p', 'x'},
            {'y', 'v'},
            {'y', 'v', 'x', 'w', 'h'},
            {'i', 'q', 'i'},
            {'u', 'u', 'p'},
            {'v', 'e', 'f', 'm', 'k', 'n', 'z', 'e'},
            {'p', 'l', 'd', 'w', 'j', 'v', 'l'},
            {'g', 'p', 'h', 'q'},
            {'x', 'j', 'z', 'f', 'm', 'k'},
            {'h', 'q', 'a', 'n', 'n', 'b', 'y', 'x', 'q'},
            {'i', 'd', 'y', 'v', 'x', 'w'},
            {'x', 'p', 'l'},
            {'k', 'm', 'a', 'u', 'l'},
            {'g', 'q', 'w'},
            {'b', 'j', 'g', 'q', 'w', 'g', 'a'},
            {'f', 'm', 'k'},
            {'e', 'i', 'a', 'l', 'h', 'e', 'h'},
            {'g', 'q', 'w', 'g', 'a', 'l', 'o'},
            {'z', 'f', 'm', 'k', 'm', 'h'},
            {'f', 'z'},
            {'u', 'u', 'p', 'x', 'x'},
            {'e', 'i', 'a', 'l', 'h'},
            {'v', 'e', 'f', 'm', 'k', 'n'},
            {'l', 'e', 's'},
            {'h', 'k', 'f'},
            {'w', 'q', 'o', 't', 'i', 'd'},
            {'p', 'f', 'h', 'k', 'f', 'v', 'e', 'f'},
            {'o', 'p', 'f', 'h'},
            {'l', 'e', 'o', 's', 'e', 'g', 'l'},
            {'h', 'q', 'h', 'y'},
            {'e', 'n', 'p', 'z', 'u', 'v'},
            {'e', 'h'},
            {'w', 'b', 'j', 'g', 'q', 'w'},
            {'o', 'h', 'r', 't', 'v', 'v'},
            {'u', 'p', 'x', 'x'},
            {'m', 'h', 'k', 'w', 'l', 'd', 'u'},
            {'a', 'n', 'n', 'b'},
            {'m', 'k'},
            {'q', 'o', 't', 'i', 'd', 'y', 'v'},
            {'g', 'y'},
            {'e', 's', 'i', 'e', 'y', 'c', 'u'},
            {'o', 'd', 'e', 'u', 'r', 'y'},
            {'e', 'f', 'm', 'k', 'n', 'z', 'e'},
            {'u', 'p', 'x'},
            {'l', 's', 'e', 'i', 'a', 'l', 'h'},
            {'e', 'f', 'm', 'k'},
            {'l', 's', 'e', 'i', 'a', 'l'},
            {'p', 'x', 'x', 's', 'd', 'r'},
            {'v', 'b', 'o', 'h', 'r', 't', 'v', 'v', 'p'},
            {'q', 'e', 'n', 'p', 'z', 'u', 'v', 'd'},
            {'h', 'r', 't', 'v'},
        };

        final char[][] P05 = {
            {'5', '0', 'v'},
            {'4', '6', 'v'},
            {'9', '0', 'v'},
            {'9', '9', 'v'},
            {'5', '1', 'v'},
            {'5', '0', 'n'},
            {'3', '0', 'v'},
            {'4', '1', 'n'},
            {'8', '7', 'n'},
            {'2', '6', 'v'},
            {'5', '0', 'n'},
            {'8', '4', 'v'},
            {'4', '0', 'v'},
            {'8', '0', 'n'},
            {'8', '0', 'n'},
            {'6', '0', 'v'},
            {'7', '9', 'n'},
            {'1', '7', 'v'},
            {'4', '8', 'v'},
            {'3', '8', 'n'},
            {'2', '1', 'v'},
            {'5', '8', 'n'},
            {'6', '0', 'n'},
            {'4', '7', 'v'},
            {'7', '6', 'v'},
            {'3', '5', 'v'},
            {'3', '3', 'v'},
            {'2', '4', 'v'},
            {'8', '5', 'n'},
            {'3', '5', 'v'},
            {'2', '3', 'v'},
            {'1', '3', 'n'},
            {'7', '9', 'n'},
            {'8', '5', 'n'},
            {'1', '7', 'v'},
            {'7', '3', 'v'},
            {'1', '4', 'v'},
            {'2', '0', 'n'},
            {'1', '2', 'v'},
            {'1', '1', 'v'},
            {'8', '7', 'n'},
            {'5', '1', 'n'},
            {'9', '7', 'v'},
            {'1', '8', 'n'},
            {'3', '2', 'v'},
            {'5', '7', 'v'},
            {'8', '9', 'n'},
            {'2', '7', 'v'},
            {'7', '8', 'n'},
            {'2', '5', 'v'},
            {'3', '0', 'n'},
            {'3', '5', 'n'},
            {'4', '2', 'n'},
            {'4', '0', 'v'},
            {'1', '8', 'v'},
            {'8', '9', 'n'},
            {'6', '5', 'n'},
            {'1', '8', 'v'},
            {'6', '5', 'n'},
            {'9', '9', 'n'},
            {'5', '5', 'v'},
            {'9', '6', 'v'},
            {'5', '8', 'v'},
        };

        final char[][] B06 = {
            {'z', 'b', 's', 's', 'l', 'm', 'k'},
            {'g', 'e', 'r', 'd', 'k'},
            {'l', 'g', 'o', 's'},
            {'g', 'j', 'u', 'i'},
            {'h', 'e', 'w', 'f', 'v', 'l', 'j'},
            {'b', 'b', 'a', 'a', 'v', 'q', 'k'},
            {'l', 'r'},
            {'a', 'a', 'v', 'q', 'k', 'q', 'j', 'i'},
            {'t', 'z', 'e', 'w', 't', 's', 'd', 's', 'c'},
            {'j', 'g'},
            {'j', 'y', 's', 'm', 'f', 'p', 'i', 'p'},
            {'z', 'n', 'g', 'i', 'w', 'p', 'c'},
            {'f', 'x', 'r', 'x', 'k', 'd', 'd', 'c'},
            {'x', 'z', 'u', 'q', 'o', 'd', 'c', 'm', 'y'},
            {'a', 'd'},
            {'w', 'l'},
            {'g', 'u', 'g', 'k', 'n', 'z', 't', 'p', 'z'},
            {'l', 'g', 'o', 's', 'o', 'j', 'q'},
            {'i', 'a', 'z', 'u'},
            {'a', 'a', 'v', 'q', 'k', 'q'},
            {'j', 'h', 'b', 'p', 'y', 'v', 's', 'd', 'b'},
            {'v', 'q', 'k', 'q', 'j', 'i', 'b'},
            {'a', 'p', 'j', 'v', 'j'},
            {'t', 'p', 'z'},
            {'s', 'u', 'i', 'a', 'z'},
            {'y', 's', 'm'},
            {'z', 'u', 'a', 'p', 't'},
            {'o', 's', 'o'},
            {'z', 'u', 'g', 'e', 'r', 'd'},
            {'l', 'j', 'h'},
            {'s', 'o', 'j', 'q'},
            {'t', 'o', 'i', 'c', 'h', 'y', 'e'},
            {'v', 'h', 'f', 'p', 'w', 'v', 'q', 'h', 't'},
            {'q', 'h', 's', 'u', 'i', 'a', 'z'},
            {'g', 'i', 'w', 'p', 'c', 'c', 'd', 'u'},
            {'f', 'n', 'p', 'v'},
            {'w', 'j', 'y'},
            {'v', 'c'},
            {'p', 'p', 'v', 'c', 'd', 'q', 'b'},
            {'u', 'i', 'a'},
            {'p', 'z', 'k', 's'},
            {'v', 'c', 'd', 'q', 'b', 'i'},
            {'a', 'a', 'v'},
            {'f', 'x', 'r', 'x', 'k', 'd'},
            {'u', 'i', 'v', 'p'},
            {'m', 'p', 't', 'p', 'p', 'v', 'c', 'd'},
            {'q', 'j'},
            {'m', 'r', 'v', 'a'},
            {'m', 'p', 't', 'p', 'p', 'v', 'c'},
            {'u', 'i', 'v'},
            {'h', 'w', 'v', 'q', 't', 'q', 'r', 'a', 't'},
            {'f', 'p', 'i', 'p', 'q', 'f'},
            {'g', 'u', 'g', 'k'},
            {'j', 'q', 'k', 'q', 'i', 'e', 'u', 'k', 'g'},
            {'w', 'v', 'q', 't', 'q'},
            {'n', 'm', 'p', 't'},
            {'p', 'q', 'f', 'j'},
            {'t', 'o', 'i'},
            {'r', 'v', 'a', 'a', 'a', 'k'},
            {'r', 'x', 'k', 'd', 'd', 'c', 'x', 'p'},
            {'m', 'f', 'p', 'i', 'p'},
            {'h', 't'},
            {'g', 'u', 'g', 'k', 'n', 'z', 't', 'p', 'z'},
            {'v', 'l', 'p', 'z', 'x', 'q'},
            {'b', 'a'},
            {'z', 'x', 'z', 'a', 'd'},
            {'f', 'p', 'i', 'p', 'q', 'f'},
            {'f', 'x', 'r', 'x', 'k'},
            {'a', 'z', 't', 'o', 'i'},
            {'p', 'v', 'd'},
            {'g', 'e', 'r', 'd', 'k', 'h', 'm', 'b', 'y'},
            {'b', 'a', 'a', 'v', 'q', 'k', 'q', 'j', 'i'},
            {'e', 'm', 'r', 'v'},
            {'s', 'u', 'r', 'n', 'w', 'a'},
            {'n', 'm', 'p', 't', 'p', 'p', 'v', 'c', 'd'},
            {'d', 'p', 'n'},
            {'b', 'b', 'a', 'a'},
            {'r', 'v', 'a', 'a', 'a', 'k', 'e', 'q'},
            {'p', 't', 'u', 'a', 'y', 'g'},
            {'p', 'z', 'k', 's', 'r'},
            {'x', 'z', 'u', 'q', 'o'},
            {'d', 'p', 'n', 'y', 's', 'r', 'd', 'b', 'g'},
            {'t', 'q'},
            {'o', 's', 'o', 'j', 'q', 'k', 'q', 'i'},
            {'d', 'p'},
        };

        final char[][] P06 = {
            {'9', '9', 'n'},
            {'9', '3', 'n'},
            {'4', '0', 'n'},
            {'5', '0', 'v'},
            {'2', '3', 'v'},
            {'6', '1', 'v'},
            {'2', '1', 'v'},
            {'6', '3', 'v'},
            {'8', '6', 'n'},
            {'6', '9', 'n'},
            {'3', '1', 'v'},
            {'7', '1', 'n'},
            {'5', '7', 'v'},
            {'7', '2', 'n'},
            {'7', '4', 'v'},
            {'3', '0', 'n'},
            {'9', '1', 'v'},
            {'4', '0', 'n'},
            {'5', '3', 'n'},
            {'6', '3', 'v'},
            {'2', '9', 'v'},
            {'6', '5', 'v'},
            {'8', '8', 'n'},
            {'9', '7', 'v'},
            {'3', '3', 'n'},
            {'3', '2', 'v'},
            {'8', '2', 'v'},
            {'6', '0', 'n'},
            {'7', '3', 'n'},
            {'2', '8', 'v'},
            {'7', '0', 'n'},
            {'4', '9', 'v'},
            {'0', '6', 'n'},
            {'1', '3', 'n'},
            {'9', '1', 'n'},
            {'3', '5', 'n'},
            {'3', '0', 'v'},
            {'0', '6', 'v'},
            {'0', '4', 'v'},
            {'4', '3', 'n'},
            {'9', '8', 'v'},
            {'0', '6', 'v'},
            {'6', '3', 'v'},
            {'5', '7', 'v'},
            {'5', '2', 'v'},
            {'0', '1', 'v'},
            {'6', '8', 'v'},
            {'3', '4', 'n'},
            {'0', '1', 'v'},
            {'5', '2', 'v'},
            {'1', '6', 'v'},
            {'3', '5', 'v'},
            {'9', '1', 'v'},
            {'9', '0', 'n'},
            {'1', '7', 'v'},
            {'0', '0', 'v'},
            {'3', '8', 'v'},
            {'4', '9', 'v'},
            {'4', '4', 'n'},
            {'5', '9', 'v'},
            {'3', '4', 'v'},
            {'7', '6', 'n'},
            {'9', '1', 'v'},
            {'1', '8', 'n'},
            {'6', '2', 'v'},
            {'7', '1', 'v'},
            {'3', '5', 'v'},
            {'5', '7', 'v'},
            {'4', '7', 'v'},
            {'5', '5', 'n'},
            {'9', '3', 'n'},
            {'6', '2', 'v'},
            {'2', '4', 'n'},
            {'4', '2', 'v'},
            {'0', '0', 'v'},
            {'7', '5', 'n'},
            {'6', '1', 'v'},
            {'4', '4', 'n'},
            {'8', '5', 'v'},
            {'9', '8', 'v'},
            {'7', '2', 'n'},
            {'7', '5', 'n'},
            {'0', '3', 'n'},
            {'6', '0', 'n'},
            {'7', '5', 'n'},
        };

        final char[][] B07 = {
            {'x', 'p', 'k', 'd', 'u', 'q', 'h'},
            {'a', 's', 'd', 'x', 'b', 'j', 'm', 'd', 'x'},
            {'i', 'y', 'm', 'k', 'h', 'j', 'u'},
            {'l', 'b'},
            {'k', 'z', 'l', 'v'},
            {'a', 'e', 'n', 'p', 'l', 'z', 'l', 'b', 't'},
            {'x', 'b', 'j'},
            {'k', 'z', 'l', 'v'},
            {'s', 'q'},
            {'s', 'o', 'd', 'z', 'g', 'm', 'r'},
            {'h', 'j', 'k', 'h', 'm', 'f', 'd'},
            {'e', 'c', 'f', 'c', 'i', 'g'},
            {'o', 'm', 'h', 'a', 'm', 'm', 'l', 'a'},
            {'r', 'p', 'u', 't'},
            {'d', 'o', 'm', 'h', 'a'},
            {'r', 'p', 'u', 't'},
            {'o', 'm', 'h', 'a'},
            {'p', 'd', 'q', 'b', 'w', 'l'},
            {'y', 's', 'o', 'a', 'm', 'p', 'f', 'j'},
            {'p', 'u', 't'},
            {'w', 'a'},
            {'o', 'm'},
            {'p', 'o', 'q', 'k', 'q', 'v', 'y', 's'},
            {'a', 's', 'd', 'x', 'b', 'j', 'm', 'd', 'x'},
            {'s', 'o', 'd', 'z', 'g'},
            {'j', 'm', 'd'},
            {'l', 'v', 'x', 'n'},
            {'a', 'e', 'n', 'p'},
            {'u', 's', 'n', 'x'},
            {'u', 'e', 'i', 'i', 'r', 'b', 'q', 'w', 'b'},
            {'x', 'b', 'j', 'm', 'd', 'x', 'm'},
            {'h', 'h'},
            {'a', 'q', 'j', 'z', 'l', 'i', 'e', 'c', 'f'},
            {'z', 'd'},
            {'u', 'p', 'c', 'o', 'm', 'x', 'e', 'p', 'r'},
            {'k', 'x', 's', 'o', 'd', 'z', 'g', 'm'},
            {'m', 'x', 'e'},
            {'v', 'x', 'n', 'g'},
            {'k', 'u', 'p', 'c', 'o', 'm', 'x', 'e'},
            {'z', 'u', 's', 'n', 'x', 'd', 'v', 'p'},
            {'m', 'd', 'x', 'm', 'y'},
            {'o', 'd', 'p', 'y', 'y', 'e'},
            {'a', 'r', 'p', 'u', 't', 'a', 'r', 'o', 'i'},
            {'p', 'x', 'd', 'b', 'w', 'z', 'u', 's', 'n'},
            {'p', 'd', 'q', 'b', 'w', 'l', 'b', 'm'},
            {'k', 'm', 'u', 'b'},
            {'v', 'x', 'n', 'g', 'r', 'n'},
            {'e', 'n', 'p', 'l', 'z', 'l'},
            {'j', 'a', 'n', 'u'},
            {'l', 'b', 'm', 'g'},
            {'l', 'i', 'y', 'm', 'k', 'h'},
            {'x', 'b', 'j', 'm', 'd', 'x'},
            {'k', 'w'},
            {'r', 'p', 'u', 't', 'a', 'r', 'o', 'i', 'k'},
            {'o', 'n', 'k', 'p', 's', 'c'},
            {'e', 'n', 'p', 'l', 'z', 'l'},
        };

        final char[][] P07 = {
            {'8', '9', 'v'},
            {'0', '4', 'n'},
            {'9', '2', 'v'},
            {'9', '1', 'n'},
            {'8', '0', 'v'},
            {'3', '1', 'n'},
            {'3', '4', 'n'},
            {'8', '0', 'v'},
            {'2', '5', 'v'},
            {'1', '4', 'v'},
            {'9', '0', 'n'},
            {'5', '8', 'v'},
            {'7', '5', 'v'},
            {'0', '5', 'v'},
            {'7', '4', 'v'},
            {'0', '5', 'v'},
            {'7', '5', 'v'},
            {'0', '6', 'n'},
            {'9', '3', 'n'},
            {'0', '6', 'v'},
            {'3', '7', 'n'},
            {'6', '9', 'n'},
            {'3', '3', 'n'},
            {'0', '4', 'n'},
            {'1', '4', 'v'},
            {'5', '4', 'n'},
            {'8', '2', 'v'},
            {'3', '1', 'n'},
            {'3', '9', 'v'},
            {'9', '8', 'v'},
            {'3', '4', 'n'},
            {'9', '6', 'n'},
            {'5', '2', 'v'},
            {'2', '3', 'v'},
            {'3', '9', 'n'},
            {'1', '2', 'v'},
            {'7', '9', 'n'},
            {'8', '3', 'v'},
            {'2', '9', 'n'},
            {'3', '8', 'v'},
            {'6', '4', 'n'},
            {'6', '9', 'v'},
            {'0', '4', 'v'},
            {'3', '3', 'v'},
            {'0', '6', 'n'},
            {'6', '3', 'v'},
            {'8', '3', 'v'},
            {'4', '1', 'n'},
            {'6', '8', 'n'},
            {'5', '6', 'n'},
            {'9', '1', 'v'},
            {'3', '4', 'n'},
            {'2', '9', 'v'},
            {'0', '5', 'v'},
            {'7', '5', 'n'},
            {'4', '1', 'n'},
        };

        final char[][] B08 = {
            {'o', 'f'},
            {'p', 't', 'u', 'j', 'q', 'm', 'g', 'm', 'x'},
            {'r', 'j', 'r', 'h', 'x', 'm', 'i', 'v', 'r'},
            {'a', 'g', 's', 'k', 'x', 'm', 'b', 'i'},
            {'z', 'k', 'i', 'q', 'u', 'w', 'm', 'k', 'b'},
            {'m', 'l'},
            {'c', 'a', 'e', 'j', 'i', 'i', 'o', 'l', 'n'},
            {'a', 'g', 's', 'k'},
            {'e', 'j'},
            {'d', 'r', 'm', 'l', 'e'},
            {'y', 'r', 'z', 'p', 'p', 't'},
            {'e', 't', 'j', 'w'},
            {'r', 'j', 's', 'e', 'f', 's', 'w'},
            {'p', 'j', 'i', 'v', 'q'},
            {'e', 'f'},
            {'d', 'i', 'g', 'o', 'w', 't', 'd'},
            {'i', 'i', 'f', 'd'},
            {'a', 'd', 'i', 'i', 'f', 'd', 'i', 'e'},
            {'g', 'e', 'j', 'd', 'r', 'm', 'l'},
            {'k', 'o'},
            {'r', 's', 'd', 's', 'o', 'j', 'r', 'r'},
            {'c', 'z'},
            {'g', 'o', 'w', 't', 'd', 'u', 'z', 'o'},
            {'n', 'f'},
            {'d', 'u', 'z', 'o', 'p', 'q', 'i', 'v'},
            {'l', 'c', 'k'},
            {'f', 'h'},
            {'e', 'j', 'd', 'r'},
            {'b', 'm', 'z', 'k', 'i'},
            {'c', 'l', 'g', 'p'},
            {'o', 'l', 'n', 'e'},
            {'n', 'e', 'z', 'u', 'o', 'a', 'e', 'u', 'n'},
            {'n', 'f', 'r', 'a'},
            {'k', 'e', 'e', 'r', 'j', 'r', 'h', 'x'},
            {'e', 'e', 'r', 'j', 'r'},
            {'a', 't', 'h', 'p', 'p', 'a', 's', 'f', 'w'},
            {'m', 'b', 'm', 'l', 'y'},
            {'r', 'a', 't', 'h', 'p', 'p', 'a', 's'},
            {'g', 'k', 'e', 'e', 'r', 'j'},
            {'w', 'j', 'r', 'r', 'j', 's'},
            {'c', 'n', 'l', 'c', 'k', 'k', 'd', 'c'},
            {'g', 'p', 'j'},
            {'t', 'j'},
            {'t', 'j', 'w', 'j', 'r', 'r', 'j', 's'},
            {'c', 'k', 'k', 'd', 'c', 'h', 't'},
            {'o', 'm', 'b', 'm'},
            {'c', 'z', 'i', 'u', 's', 'o', 's', 'e', 'y'},
            {'r', 'z', 'p', 'p', 't', 'a', 'n', 'd'},
            {'p', 'g', 'n', 'k', 'x', 'n', 'a', 'a'},
            {'e', 'd', 'i', 'i', 'o', 'l', 'n', 'e'},
            {'n', 'l', 'c', 'k', 'k', 'd', 'c', 'h'},
            {'c', 'h', 'x', 'o', 'm', 'b'},
        };

        final char[][] P08 = {
            {'5', '3', 'v'},
            {'8', '1', 'n'},
            {'8', '2', 'n'},
            {'7', '8', 'n'},
            {'4', '7', 'v'},
            {'6', '6', 'n'},
            {'0', '9', 'n'},
            {'7', '8', 'n'},
            {'8', '4', 'n'},
            {'6', '4', 'v'},
            {'8', '6', 'n'},
            {'9', '0', 'v'},
            {'9', '6', 'v'},
            {'8', '7', 'n'},
            {'9', '9', 'v'},
            {'3', '3', 'v'},
            {'3', '4', 'n'},
            {'1', '4', 'n'},
            {'6', '1', 'v'},
            {'5', '2', 'v'},
            {'1', '3', 'n'},
            {'5', '7', 'v'},
            {'3', '5', 'v'},
            {'1', '1', 'v'},
            {'3', '9', 'v'},
            {'0', '8', 'v'},
            {'2', '7', 'v'},
            {'6', '2', 'v'},
            {'4', '5', 'v'},
            {'5', '7', 'n'},
            {'6', '9', 'n'},
            {'8', '9', 'n'},
            {'1', '1', 'v'},
            {'5', '2', 'n'},
            {'6', '2', 'n'},
            {'1', '4', 'v'},
            {'4', '6', 'n'},
            {'1', '3', 'v'},
            {'4', '2', 'n'},
            {'9', '3', 'v'},
            {'0', '6', 'v'},
            {'7', '7', 'n'},
            {'9', '1', 'v'},
            {'9', '1', 'v'},
            {'0', '9', 'v'},
            {'3', '6', 'n'},
            {'5', '7', 'v'},
            {'9', '6', 'n'},
            {'8', '7', 'v'},
            {'2', '9', 'n'},
            {'0', '7', 'v'},
            {'0', '6', 'n'},
        };

        final char[][] B09 = {
            {'b', 'n', 'f', 'b', 's', 'a'},
            {'n', 'w', 'b', 'n', 'j', 'c'},
            {'u', 'b', 'u', 'k'},
            {'s', 'p', 't'},
            {'p', 'z', 'z', 'l', 'k'},
            {'f', 'p', 'z'},
            {'n', 'n', 'a'},
            {'x', 'l', 'a', 'e', 'f', 'p', 'z'},
            {'w', 'b', 'n', 'j', 'z', 'g', 'u', 's', 'c'},
            {'l', 'z', 's', 'd', 'z', 'h', 'w', 'i'},
            {'g', 'n'},
            {'f', 'n'},
            {'v', 'm', 'o', 'f', 'n'},
            {'h', 'y', 'q', 'f', 'u', 'j', 'p', 'r'},
            {'e', 'b', 'n', 'f', 'b', 's'},
            {'f', 'f', 'h', 'c', 'm', 'u', 'u', 'q', 'c'},
            {'s', 'd', 's', 'x', 'j', 'i'},
            {'o', 's', 'f', 'e', 'b', 'n', 'f'},
            {'i', 'i', 'j', 'u'},
            {'s', 's', 'd', 'x', 'q', 'l', 't'},
            {'n', 'b', 'c', 'n', 'w', 'b', 'n', 'j'},
            {'n', 'a', 'y', 'f', 'y'},
            {'k', 't', 'i'},
        };

        final char[][] P09 = {
            {'6', '4', 'v'},
            {'4', '7', 'n'},
            {'5', '4', 'n'},
            {'7', '1', 'v'},
            {'9', '6', 'v'},
            {'9', '5', 'v'},
            {'1', '6', 'v'},
            {'9', '1', 'v'},
            {'5', '7', 'n'},
            {'9', '2', 'n'},
            {'1', '5', 'v'},
            {'4', '9', 'n'},
            {'4', '0', 'n'},
            {'3', '6', 'n'},
            {'6', '3', 'v'},
            {'3', '4', 'v'},
            {'0', '0', 'v'},
            {'6', '0', 'v'},
            {'5', '1', 'v'},
            {'6', '1', 'n'},
            {'1', '7', 'n'},
            {'6', '5', 'n'},
            {'3', '1', 'n'},
        };

        final char[][] B10 = {
            {'z', 'g', 'i', 'o'},
            {'j', 'x', 's', 't', 'l', 'v'},
            {'g', 'i', 'o', 'e', 'p', 't', 'd', 'v', 's'},
            {'x', 'm', 'p', 'x'},
            {'v', 'o', 'v', 'u'},
            {'x', 'x', 'm', 'u'},
            {'j', 'g', 'w'},
            {'j', 'g', 'w', 'i', 'p'},
            {'m', 'b'},
            {'e', 'p', 't', 'd', 'v', 's', 'g'},
            {'w', 'w', 's'},
            {'g', 'w', 'i'},
            {'f', 'j', 'k', 'p', 'd'},
            {'k', 'u', 'm'},
            {'j', 't'},
            {'s', 'k', 'i', 'g', 's', 'b', 'r', 's'},
            {'j', 'x', 'm', 'p', 'x', 'v', 'p', 'j'},
            {'v', 'c'},
            {'u', 'm', 'w', 'n', 'e'},
            {'x', 'w', 'u', 'i', 'j', 'x', 's'},
            {'i', 'j', 'x', 's', 't'},
            {'q', 'c', 'v', 'o', 'v', 'u', 'v', 'j', 'g'},
            {'v', 'm', 'k'},
            {'y', 'v', 'r', 'c', 'p'},
            {'e', 'u'},
            {'v', 'j', 'g', 'w', 'i', 'p', 'm', 'f', 'k'},
            {'i', 'j', 'x', 's', 't', 'l', 'v'},
            {'x', 'q', 'j', 'u', 'i'},
            {'j', 'x', 'm', 'p'},
            {'t', 'a', 's'},
            {'x', 's', 't', 'l', 'v', 'b', 'o'},
            {'l', 'p', 'a', 'q', 'c', 'v', 'o'},
            {'d', 's', 'y', 'y', 'n', 'y', 'v'},
            {'o', 'o', 'q', 'r'},
            {'u', 'm', 'w'},
            {'g', 'c', 'p', 'm', 'k'},
            {'s', 'l', 'v'},
            {'m', 'f', 'k', 'y', 'w'},
            {'p', 'd'},
            {'p', 't', 'd', 'v', 's', 'g', 'w'},
            {'p', 'x', 'v', 'p', 'j', 'j', 't', 'g'},
            {'n', 'b'},
            {'e', 'c', 'i', 'm', 'i', 'n', 'b'},
            {'r', 'o', 'v', 'c', 't', 't', 'y', 'n', 'l'},
            {'b', 'v', 'r'},
            {'w', 'w', 's', 'o', 'd'},
            {'i', 'p', 'm', 'f'},
            {'q', 'c', 'v'},
            {'d', 'f', 'f', 'i', 'd', 'r', 'o', 'v', 'c'},
            {'t', 'x'},
            {'k', 'q', 'u', 'x', 'w', 'w', 's', 'o'},
            {'p', 't', 'd'},
            {'c', 's', 'l', 'v', 'v', 'k', 'k'},
            {'i', 'c', 'f', 'i', 'b', 'q', 'u', 'b', 'h'},
            {'r', 'k', 'u', 'm', 'w', 'n'},
            {'t', 'z', 'g', 'i', 'o', 'e'},
        };

        final char[][] P10 = {
            {'1', '3', 'v'},
            {'8', '3', 'n'},
            {'1', '4', 'v'},
            {'6', '4', 'n'},
            {'5', '8', 'n'},
            {'9', '3', 'v'},
            {'4', '5', 'n'},
            {'4', '5', 'n'},
            {'5', '1', 'v'},
            {'1', '7', 'v'},
            {'6', '5', 'v'},
            {'5', '5', 'n'},
            {'0', '1', 'v'},
            {'3', '6', 'n'},
            {'0', '2', 'n'},
            {'2', '7', 'n'},
            {'5', '4', 'n'},
            {'9', '9', 'n'},
            {'4', '6', 'n'},
            {'4', '3', 'n'},
            {'7', '3', 'n'},
            {'3', '8', 'n'},
            {'2', '3', 'v'},
            {'8', '0', 'n'},
            {'8', '6', 'n'},
            {'3', '5', 'n'},
            {'7', '3', 'n'},
            {'4', '3', 'v'},
            {'5', '4', 'n'},
            {'1', '2', 'n'},
            {'9', '3', 'n'},
            {'0', '8', 'n'},
            {'3', '0', 'n'},
            {'8', '9', 'v'},
            {'4', '6', 'n'},
            {'2', '1', 'n'},
            {'3', '2', 'v'},
            {'9', '5', 'n'},
            {'0', '4', 'v'},
            {'1', '8', 'v'},
            {'8', '4', 'n'},
            {'7', '6', 'v'},
            {'7', '1', 'v'},
            {'7', '9', 'n'},
            {'7', '7', 'v'},
            {'6', '5', 'v'},
            {'7', '5', 'n'},
            {'3', '8', 'n'},
            {'2', '9', 'n'},
            {'9', '2', 'v'},
            {'6', '1', 'v'},
            {'1', '8', 'v'},
            {'3', '1', 'v'},
            {'4', '7', 'v'},
            {'2', '6', 'n'},
            {'1', '2', 'v'},
        };

        System.out.println(Druga.krizankaOK(B01, P01));
        System.out.println(Druga.krizankaOK(B02, P02));
        System.out.println(Druga.krizankaOK(B03, P03));
        System.out.println(Druga.krizankaOK(B04, P04));
        System.out.println(Druga.krizankaOK(B05, P05));
        System.out.println(Druga.krizankaOK(B06, P06));
        System.out.println(Druga.krizankaOK(B07, P07));
        System.out.println(Druga.krizankaOK(B08, P08));
        System.out.println(Druga.krizankaOK(B09, P09));
        System.out.println(Druga.krizankaOK(B10, P10));
    }
}
