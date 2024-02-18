
import java.util.*;

public class Test03 {

    public static void main(String[] args) {
        final char[][] B01 = {
            {'g'},
            {'a'},
            {'r'},
            {'d'},
            {'t'},
            {'w'},
            {'u'},
            {'r'},
            {'l'},
            {'p'},
            {'u'},
            {'d'},
            {'u'},
            {'z'},
            {'i'},
            {'t'},
            {'n'},
            {'c'},
            {'b'},
            {'c'},
            {'l'},
            {'a'},
            {'m'},
            {'b'},
            {'q'},
            {'d'},
            {'g'},
            {'e'},
            {'y'},
            {'b'},
            {'i'},
            {'x'},
            {'t'},
            {'o'},
            {'e'},
            {'k'},
            {'r'},
            {'d'},
            {'o'},
            {'l'},
            {'i'},
            {'m'},
            {'v'},
            {'w'},
            {'r'},
            {'b'},
            {'d'},
            {'r'},
            {'r'},
            {'n'},
            {'z'},
            {'g'},
            {'u'},
            {'r'},
            {'q'},
            {'x'},
            {'n'},
            {'w'},
            {'t'},
            {'x'},
            {'h'},
            {'t'},
            {'d'},
            {'m'},
            {'a'},
            {'a'},
            {'q'},
            {'y'},
            {'t'},
            {'w'},
            {'m'},
            {'q'},
            {'x'},
            {'u'},
            {'w'},
            {'x'},
            {'t'},
            {'h'},
            {'g'},
            {'d'},
            {'o'},
            {'o'},
            {'t'},
            {'z'},
            {'o'},
            {'d'},
            {'a'},
            {'r'},
            {'p'},
            {'r'},
        };

        final char[][] P01 = {
            {'2', '8', 'n'},
            {'7', '4', 'v'},
            {'4', '2', 'v'},
            {'3', '6', 'n'},
            {'4', '8', 'n'},
            {'3', '2', 'n'},
            {'0', '5', 'n'},
            {'2', '7', 'v'},
            {'8', '8', 'n'},
            {'4', '6', 'n'},
            {'8', '0', 'n'},
            {'1', '0', 'v'},
            {'9', '4', 'n'},
            {'2', '4', 'n'},
            {'7', '7', 'v'},
            {'6', '1', 'v'},
            {'7', '9', 'n'},
            {'3', '8', 'n'},
            {'4', '3', 'v'},
            {'3', '8', 'n'},
            {'8', '8', 'v'},
            {'3', '5', 'v'},
            {'5', '7', 'v'},
            {'4', '3', 'v'},
            {'0', '2', 'n'},
            {'7', '5', 'n'},
            {'5', '1', 'v'},
            {'5', '0', 'v'},
            {'2', '6', 'v'},
            {'2', '3', 'n'},
            {'7', '7', 'v'},
            {'8', '6', 'n'},
            {'6', '2', 'n'},
            {'8', '9', 'v'},
            {'5', '0', 'v'},
            {'0', '9', 'n'},
            {'8', '2', 'n'},
            {'3', '6', 'n'},
            {'5', '5', 'n'},
            {'0', '3', 'v'},
            {'6', '9', 'n'},
            {'0', '4', 'n'},
            {'1', '3', 'v'},
            {'2', '1', 'v'},
            {'4', '2', 'n'},
            {'6', '6', 'n'},
            {'2', '2', 'v'},
            {'4', '2', 'n'},
            {'8', '4', 'n'},
            {'7', '9', 'n'},
            {'6', '5', 'n'},
            {'4', '9', 'v'},
            {'9', '4', 'n'},
            {'8', '2', 'v'},
            {'1', '8', 'n'},
            {'5', '2', 'n'},
            {'9', '9', 'n'},
            {'3', '1', 'v'},
            {'6', '2', 'n'},
            {'8', '6', 'v'},
            {'1', '6', 'v'},
            {'3', '9', 'n'},
            {'2', '2', 'n'},
            {'0', '4', 'n'},
            {'2', '9', 'v'},
            {'7', '4', 'n'},
            {'1', '8', 'v'},
            {'8', '4', 'v'},
            {'0', '0', 'v'},
            {'3', '2', 'v'},
            {'8', '7', 'n'},
            {'1', '8', 'v'},
            {'3', '7', 'n'},
            {'0', '5', 'v'},
            {'6', '8', 'v'},
            {'3', '7', 'n'},
            {'6', '2', 'n'},
            {'1', '6', 'n'},
            {'4', '9', 'n'},
            {'3', '6', 'v'},
            {'5', '4', 'n'},
            {'8', '9', 'v'},
            {'6', '1', 'n'},
            {'8', '5', 'v'},
            {'5', '4', 'n'},
            {'9', '2', 'v'},
            {'2', '9', 'n'},
            {'2', '7', 'v'},
            {'6', '3', 'v'},
            {'9', '1', 'n'},
        };

        final char[][] B02 = {
            {'d'},
            {'k'},
            {'p'},
            {'v'},
            {'j'},
            {'g'},
            {'i'},
            {'q'},
            {'l'},
            {'g'},
            {'f'},
            {'t'},
            {'v'},
            {'b'},
            {'v'},
            {'b'},
            {'r'},
            {'u'},
            {'q'},
            {'c'},
            {'l'},
            {'a'},
            {'c'},
            {'q'},
            {'n'},
            {'y'},
            {'z'},
            {'u'},
            {'b'},
            {'b'},
            {'k'},
            {'a'},
            {'j'},
            {'p'},
            {'z'},
            {'u'},
            {'f'},
            {'v'},
            {'b'},
            {'z'},
            {'n'},
            {'f'},
            {'e'},
            {'u'},
            {'u'},
            {'i'},
            {'d'},
            {'a'},
            {'w'},
            {'h'},
            {'a'},
            {'d'},
            {'j'},
            {'a'},
            {'j'},
            {'w'},
            {'c'},
            {'t'},
            {'b'},
            {'r'},
            {'l'},
            {'n'},
            {'y'},
            {'v'},
            {'v'},
            {'b'},
            {'f'},
            {'d'},
            {'v'},
            {'l'},
            {'n'},
            {'b'},
            {'r'},
            {'d'},
            {'y'},
            {'j'},
            {'m'},
            {'b'},
            {'v'},
            {'i'},
            {'e'},
            {'v'},
            {'f'},
        };

        final char[][] P02 = {
            {'7', '2', 'v'},
            {'8', '1', 'n'},
            {'4', '1', 'n'},
            {'4', '7', 'v'},
            {'3', '6', 'v'},
            {'6', '5', 'v'},
            {'9', '3', 'v'},
            {'9', '7', 'n'},
            {'8', '8', 'v'},
            {'6', '5', 'v'},
            {'1', '1', 'v'},
            {'6', '4', 'v'},
            {'7', '8', 'v'},
            {'2', '7', 'n'},
            {'7', '8', 'n'},
            {'1', '6', 'n'},
            {'6', '3', 'n'},
            {'2', '4', 'n'},
            {'9', '6', 'v'},
            {'1', '8', 'n'},
            {'8', '8', 'v'},
            {'7', '7', 'n'},
            {'1', '9', 'v'},
            {'6', '1', 'v'},
            {'5', '1', 'v'},
            {'9', '5', 'n'},
            {'0', '8', 'n'},
            {'2', '4', 'v'},
            {'1', '6', 'v'},
            {'2', '3', 'v'},
            {'8', '1', 'v'},
            {'5', '6', 'v'},
            {'5', '7', 'v'},
            {'3', '4', 'v'},
            {'0', '8', 'v'},
            {'6', '6', 'v'},
            {'8', '3', 'v'},
            {'0', '9', 'v'},
            {'5', '8', 'n'},
            {'3', '1', 'n'},
            {'5', '1', 'v'},
            {'8', '3', 'v'},
            {'6', '7', 'n'},
            {'2', '4', 'n'},
            {'0', '3', 'v'},
            {'3', '7', 'v'},
            {'4', '6', 'n'},
            {'5', '6', 'n'},
            {'9', '4', 'n'},
            {'1', '7', 'n'},
            {'5', '2', 'v'},
            {'7', '2', 'n'},
            {'5', '7', 'n'},
            {'7', '7', 'v'},
            {'3', '6', 'v'},
            {'2', '6', 'n'},
            {'1', '8', 'v'},
            {'4', '3', 'v'},
            {'2', '7', 'n'},
            {'6', '8', 'v'},
            {'8', '8', 'n'},
            {'5', '1', 'n'},
            {'8', '4', 'n'},
            {'0', '9', 'v'},
            {'5', '9', 'v'},
            {'1', '6', 'v'},
            {'7', '9', 'v'},
            {'3', '0', 'v'},
            {'8', '9', 'v'},
            {'2', '9', 'v'},
            {'5', '1', 'v'},
            {'0', '0', 'n'},
            {'6', '8', 'v'},
            {'7', '2', 'v'},
            {'0', '2', 'n'},
            {'5', '7', 'v'},
            {'7', '1', 'n'},
            {'0', '6', 'n'},
            {'7', '8', 'v'},
            {'3', '3', 'n'},
            {'1', '3', 'v'},
            {'5', '9', 'n'},
            {'7', '5', 'n'},
        };

        final char[][] B03 = {
            {'i'},
            {'u'},
            {'d'},
            {'t'},
            {'x'},
            {'x'},
            {'k'},
            {'o'},
            {'x'},
            {'z'},
            {'a'},
            {'a'},
            {'c'},
            {'j'},
            {'w'},
            {'y'},
            {'g'},
            {'h'},
            {'h'},
            {'f'},
            {'w'},
            {'r'},
            {'x'},
            {'c'},
            {'l'},
            {'c'},
            {'y'},
            {'d'},
            {'p'},
            {'a'},
            {'z'},
            {'x'},
            {'o'},
            {'b'},
            {'y'},
            {'n'},
            {'j'},
            {'d'},
            {'h'},
            {'f'},
            {'w'},
            {'y'},
            {'y'},
            {'g'},
            {'b'},
            {'r'},
            {'z'},
            {'m'},
            {'p'},
            {'b'},
            {'k'},
            {'p'},
            {'c'},
            {'t'},
            {'r'},
            {'y'},
            {'y'},
            {'n'},
            {'n'},
            {'c'},
            {'w'},
            {'x'},
            {'w'},
            {'u'},
            {'m'},
            {'w'},
            {'y'},
            {'x'},
            {'y'},
            {'a'},
            {'c'},
            {'x'},
            {'g'},
            {'b'},
            {'p'},
            {'x'},
            {'v'},
            {'d'},
            {'i'},
            {'i'},
            {'y'},
            {'l'},
            {'d'},
            {'c'},
            {'q'},
            {'f'},
            {'o'},
            {'z'},
            {'a'},
            {'d'},
            {'w'},
            {'k'},
            {'b'},
            {'k'},
            {'l'},
            {'e'},
        };

        final char[][] P03 = {
            {'2', '0', 'n'},
            {'1', '6', 'n'},
            {'3', '9', 'v'},
            {'7', '5', 'n'},
            {'3', '0', 'v'},
            {'3', '0', 'v'},
            {'1', '0', 'v'},
            {'8', '0', 'n'},
            {'6', '7', 'n'},
            {'2', '6', 'n'},
            {'9', '1', 'n'},
            {'7', '0', 'v'},
            {'5', '0', 'v'},
            {'1', '9', 'n'},
            {'5', '2', 'n'},
            {'7', '6', 'n'},
            {'6', '6', 'n'},
            {'0', '1', 'v'},
            {'0', '1', 'v'},
            {'6', '3', 'v'},
            {'8', '4', 'n'},
            {'9', '8', 'v'},
            {'3', '0', 'v'},
            {'9', '3', 'n'},
            {'4', '6', 'n'},
            {'4', '4', 'v'},
            {'5', '8', 'n'},
            {'0', '9', 'n'},
            {'0', '3', 'v'},
            {'7', '0', 'n'},
            {'0', '2', 'n'},
            {'6', '0', 'v'},
            {'6', '8', 'v'},
            {'8', '2', 'n'},
            {'7', '6', 'v'},
            {'8', '5', 'v'},
            {'5', '6', 'v'},
            {'7', '6', 'n'},
            {'0', '6', 'v'},
            {'6', '3', 'v'},
            {'3', '5', 'v'},
            {'6', '1', 'n'},
            {'5', '8', 'v'},
            {'6', '6', 'v'},
            {'8', '2', 'v'},
            {'3', '1', 'n'},
            {'2', '6', 'v'},
            {'5', '1', 'v'},
            {'6', '2', 'n'},
            {'6', '4', 'n'},
            {'9', '9', 'v'},
            {'1', '5', 'n'},
            {'5', '0', 'n'},
            {'7', '5', 'n'},
            {'9', '8', 'n'},
            {'6', '1', 'v'},
            {'2', '8', 'n'},
            {'8', '5', 'n'},
            {'1', '3', 'n'},
            {'5', '0', 'v'},
            {'3', '5', 'v'},
            {'6', '7', 'v'},
            {'5', '2', 'v'},
            {'1', '6', 'n'},
            {'8', '8', 'n'},
            {'5', '2', 'v'},
            {'6', '1', 'v'},
            {'6', '7', 'v'},
            {'7', '1', 'n'},
            {'9', '1', 'v'},
            {'5', '0', 'n'},
            {'6', '7', 'n'},
            {'6', '6', 'v'},
            {'8', '2', 'v'},
            {'1', '5', 'v'},
            {'6', '7', 'n'},
            {'8', '6', 'v'},
            {'7', '6', 'n'},
            {'2', '0', 'v'},
            {'3', '3', 'v'},
            {'7', '7', 'n'},
            {'5', '9', 'v'},
            {'9', '6', 'n'},
            {'3', '8', 'n'},
            {'4', '0', 'n'},
            {'3', '6', 'n'},
            {'6', '8', 'v'},
            {'2', '6', 'v'},
            {'1', '4', 'n'},
            {'3', '9', 'v'},
            {'5', '2', 'v'},
            {'0', '8', 'v'},
            {'8', '2', 'n'},
            {'0', '8', 'n'},
            {'5', '9', 'v'},
            {'9', '2', 'n'},
        };

        final char[][] B04 = {
            {'u'},
            {'z'},
            {'d'},
            {'h'},
            {'b'},
            {'c'},
            {'x'},
            {'b'},
            {'t'},
            {'l'},
            {'s'},
            {'m'},
            {'s'},
            {'x'},
            {'d'},
            {'f'},
            {'s'},
            {'i'},
            {'x'},
            {'a'},
            {'q'},
            {'p'},
            {'a'},
            {'q'},
            {'v'},
            {'p'},
            {'g'},
            {'z'},
            {'a'},
            {'v'},
            {'o'},
            {'k'},
            {'g'},
            {'d'},
            {'u'},
            {'q'},
        };

        final char[][] P04 = {
            {'5', '5', 'n'},
            {'1', '7', 'n'},
            {'4', '9', 'n'},
            {'6', '5', 'n'},
            {'9', '1', 'v'},
            {'3', '9', 'n'},
            {'2', '1', 'v'},
            {'9', '1', 'v'},
            {'1', '2', 'n'},
            {'4', '1', 'n'},
            {'3', '8', 'v'},
            {'5', '8', 'n'},
            {'6', '8', 'v'},
            {'6', '0', 'v'},
            {'7', '4', 'n'},
            {'7', '5', 'n'},
            {'0', '6', 'n'},
            {'0', '2', 'n'},
            {'9', '2', 'v'},
            {'9', '0', 'n'},
            {'9', '9', 'v'},
            {'6', '9', 'v'},
            {'3', '1', 'v'},
            {'1', '1', 'v'},
            {'6', '6', 'n'},
            {'7', '4', 'v'},
            {'2', '6', 'n'},
            {'1', '7', 'v'},
            {'8', '6', 'n'},
            {'7', '9', 'v'},
            {'1', '6', 'n'},
            {'6', '4', 'n'},
            {'1', '0', 'v'},
            {'8', '7', 'n'},
            {'5', '6', 'n'},
            {'9', '4', 'n'},
        };

        final char[][] B05 = {
            {'m'},
            {'v'},
            {'q'},
            {'l'},
            {'a'},
            {'t'},
            {'b'},
            {'t'},
            {'r'},
            {'c'},
            {'f'},
            {'y'},
            {'y'},
            {'w'},
            {'r'},
            {'b'},
            {'i'},
            {'z'},
            {'s'},
            {'s'},
            {'w'},
            {'n'},
            {'m'},
            {'t'},
            {'t'},
            {'d'},
            {'n'},
            {'y'},
            {'o'},
            {'c'},
            {'g'},
            {'d'},
            {'m'},
            {'s'},
            {'c'},
            {'l'},
            {'b'},
            {'d'},
            {'m'},
            {'u'},
            {'j'},
            {'r'},
            {'c'},
            {'s'},
            {'a'},
            {'a'},
            {'c'},
            {'z'},
            {'c'},
            {'q'},
            {'h'},
            {'x'},
            {'x'},
            {'x'},
            {'f'},
            {'j'},
            {'u'},
            {'s'},
            {'s'},
            {'t'},
            {'c'},
            {'y'},
            {'u'},
            {'u'},
            {'w'},
            {'s'},
            {'r'},
            {'q'},
            {'j'},
            {'u'},
            {'h'},
            {'j'},
            {'r'},
            {'x'},
            {'f'},
            {'k'},
            {'r'},
            {'s'},
            {'s'},
        };

        final char[][] P05 = {
            {'4', '0', 'n'},
            {'7', '6', 'v'},
            {'3', '2', 'n'},
            {'9', '5', 'v'},
            {'8', '9', 'n'},
            {'0', '5', 'n'},
            {'9', '8', 'v'},
            {'0', '9', 'v'},
            {'2', '0', 'v'},
            {'6', '7', 'v'},
            {'1', '6', 'n'},
            {'4', '3', 'v'},
            {'3', '8', 'n'},
            {'2', '1', 'v'},
            {'6', '5', 'v'},
            {'9', '8', 'n'},
            {'6', '3', 'v'},
            {'4', '5', 'v'},
            {'5', '3', 'n'},
            {'9', '4', 'v'},
            {'3', '3', 'v'},
            {'4', '8', 'v'},
            {'4', '0', 'v'},
            {'0', '9', 'v'},
            {'0', '5', 'n'},
            {'7', '2', 'v'},
            {'1', '3', 'v'},
            {'3', '8', 'n'},
            {'9', '1', 'v'},
            {'6', '7', 'n'},
            {'3', '0', 'v'},
            {'1', '2', 'n'},
            {'0', '8', 'n'},
            {'8', '8', 'v'},
            {'5', '6', 'n'},
            {'9', '5', 'v'},
            {'8', '2', 'n'},
            {'2', '3', 'n'},
            {'4', '0', 'v'},
            {'4', '7', 'n'},
            {'1', '5', 'v'},
            {'5', '4', 'v'},
            {'8', '4', 'n'},
            {'8', '7', 'n'},
            {'8', '9', 'n'},
            {'2', '4', 'v'},
            {'0', '7', 'n'},
            {'4', '5', 'n'},
            {'0', '7', 'n'},
            {'3', '8', 'n'},
            {'5', '5', 'n'},
            {'6', '8', 'n'},
            {'6', '8', 'v'},
            {'3', '5', 'v'},
            {'9', '0', 'v'},
            {'5', '8', 'n'},
            {'8', '5', 'v'},
            {'2', '5', 'v'},
            {'5', '3', 'v'},
            {'0', '5', 'v'},
            {'0', '7', 'v'},
            {'3', '7', 'n'},
            {'4', '7', 'n'},
            {'1', '9', 'v'},
            {'3', '3', 'v'},
            {'8', '8', 'n'},
            {'1', '4', 'v'},
            {'7', '1', 'n'},
            {'2', '8', 'v'},
            {'8', '5', 'v'},
            {'5', '5', 'n'},
            {'2', '8', 'n'},
            {'5', '0', 'v'},
            {'2', '2', 'n'},
            {'3', '9', 'v'},
            {'5', '7', 'n'},
            {'6', '5', 'v'},
            {'8', '7', 'v'},
            {'8', '7', 'v'},
        };

        final char[][] B06 = {
            {'j'},
            {'j'},
            {'r'},
            {'k'},
            {'v'},
            {'u'},
            {'g'},
            {'s'},
            {'r'},
            {'x'},
            {'o'},
            {'b'},
            {'m'},
            {'i'},
            {'e'},
            {'g'},
            {'i'},
            {'x'},
            {'h'},
            {'y'},
            {'a'},
            {'b'},
            {'u'},
            {'i'},
            {'x'},
            {'c'},
            {'b'},
            {'u'},
            {'g'},
            {'k'},
            {'l'},
            {'k'},
            {'v'},
            {'c'},
            {'z'},
            {'a'},
            {'k'},
            {'v'},
            {'y'},
            {'s'},
            {'f'},
            {'t'},
            {'p'},
            {'h'},
            {'e'},
            {'c'},
            {'k'},
            {'y'},
            {'r'},
            {'n'},
            {'o'},
            {'n'},
            {'v'},
            {'g'},
            {'z'},
            {'h'},
            {'z'},
            {'g'},
            {'c'},
            {'p'},
            {'y'},
            {'u'},
            {'n'},
            {'v'},
            {'y'},
            {'v'},
            {'y'},
            {'z'},
            {'n'},
            {'e'},
            {'a'},
            {'b'},
            {'b'},
            {'p'},
            {'m'},
            {'w'},
            {'q'},
            {'b'},
            {'f'},
            {'e'},
            {'j'},
            {'j'},
            {'q'},
            {'m'},
            {'r'},
        };

        final char[][] P06 = {
            {'0', '1', 'v'},
            {'0', '1', 'n'},
            {'6', '2', 'v'},
            {'4', '9', 'n'},
            {'2', '2', 'v'},
            {'2', '5', 'v'},
            {'5', '1', 'n'},
            {'6', '0', 'v'},
            {'1', '2', 'v'},
            {'9', '5', 'v'},
            {'9', '4', 'n'},
            {'8', '3', 'n'},
            {'4', '0', 'v'},
            {'7', '6', 'v'},
            {'0', '9', 'v'},
            {'5', '5', 'v'},
            {'2', '0', 'n'},
            {'9', '5', 'n'},
            {'8', '1', 'v'},
            {'4', '7', 'n'},
            {'5', '8', 'n'},
            {'3', '4', 'v'},
            {'5', '3', 'v'},
            {'7', '6', 'n'},
            {'5', '6', 'n'},
            {'2', '4', 'n'},
            {'8', '3', 'v'},
            {'5', '0', 'v'},
            {'5', '1', 'n'},
            {'9', '8', 'n'},
            {'7', '4', 'n'},
            {'3', '9', 'v'},
            {'2', '2', 'v'},
            {'8', '7', 'v'},
            {'8', '9', 'v'},
            {'4', '4', 'n'},
            {'4', '9', 'n'},
            {'2', '6', 'n'},
            {'9', '5', 'n'},
            {'5', '4', 'n'},
            {'7', '5', 'v'},
            {'5', '2', 'n'},
            {'9', '9', 'v'},
            {'7', '0', 'n'},
            {'0', '9', 'n'},
            {'2', '4', 'n'},
            {'9', '8', 'v'},
            {'0', '3', 'n'},
            {'1', '2', 'n'},
            {'9', '2', 'v'},
            {'9', '4', 'v'},
            {'3', '3', 'v'},
            {'6', '3', 'v'},
            {'7', '2', 'n'},
            {'0', '4', 'n'},
            {'0', '2', 'v'},
            {'8', '9', 'n'},
            {'5', '1', 'v'},
            {'1', '0', 'v'},
            {'9', '9', 'v'},
            {'8', '0', 'n'},
            {'5', '3', 'v'},
            {'3', '3', 'v'},
            {'2', '6', 'n'},
            {'2', '8', 'v'},
            {'2', '6', 'v'},
            {'4', '7', 'v'},
            {'0', '4', 'n'},
            {'3', '3', 'v'},
            {'1', '7', 'v'},
            {'5', '8', 'n'},
            {'4', '8', 'v'},
            {'9', '1', 'v'},
            {'9', '9', 'n'},
            {'0', '7', 'v'},
            {'4', '3', 'n'},
            {'3', '5', 'v'},
            {'4', '8', 'n'},
            {'8', '6', 'v'},
            {'0', '9', 'v'},
            {'1', '1', 'n'},
            {'0', '1', 'v'},
            {'3', '5', 'n'},
            {'2', '9', 'n'},
            {'1', '2', 'v'},
        };

        final char[][] B07 = {
            {'d'},
            {'a'},
            {'k'},
            {'s'},
            {'q'},
            {'n'},
            {'a'},
            {'h'},
            {'m'},
            {'y'},
            {'q'},
            {'c'},
            {'r'},
            {'z'},
            {'j'},
            {'p'},
            {'w'},
            {'t'},
        };

        final char[][] P07 = {
            {'1', '9', 'n'},
            {'2', '6', 'n'},
            {'9', '9', 'v'},
            {'3', '2', 'v'},
            {'8', '9', 'n'},
            {'9', '5', 'v'},
            {'8', '0', 'n'},
            {'4', '5', 'n'},
            {'0', '6', 'n'},
            {'7', '7', 'n'},
            {'0', '2', 'n'},
            {'0', '4', 'v'},
            {'5', '8', 'n'},
            {'9', '7', 'n'},
            {'3', '4', 'v'},
            {'1', '2', 'n'},
            {'2', '3', 'n'},
            {'5', '9', 'v'},
        };

        final char[][] B08 = {
            {'u'},
            {'u'},
            {'p'},
            {'d'},
            {'i'},
            {'f'},
            {'e'},
            {'h'},
            {'g'},
            {'s'},
            {'x'},
            {'k'},
            {'u'},
            {'q'},
            {'z'},
            {'x'},
            {'c'},
            {'r'},
            {'e'},
            {'k'},
            {'r'},
            {'u'},
            {'r'},
            {'p'},
            {'d'},
            {'j'},
            {'p'},
            {'l'},
            {'f'},
            {'g'},
            {'t'},
            {'q'},
            {'u'},
            {'y'},
            {'d'},
            {'u'},
            {'l'},
            {'t'},
            {'y'},
            {'u'},
            {'r'},
            {'z'},
            {'o'},
            {'u'},
            {'z'},
            {'v'},
        };

        final char[][] P08 = {
            {'4', '3', 'n'},
            {'3', '1', 'v'},
            {'6', '1', 'n'},
            {'5', '5', 'n'},
            {'9', '2', 'n'},
            {'8', '7', 'v'},
            {'6', '6', 'v'},
            {'8', '8', 'v'},
            {'0', '2', 'n'},
            {'0', '0', 'n'},
            {'1', '1', 'n'},
            {'5', '0', 'n'},
            {'3', '1', 'v'},
            {'3', '8', 'n'},
            {'7', '3', 'n'},
            {'1', '1', 'v'},
            {'0', '7', 'v'},
            {'5', '3', 'n'},
            {'6', '6', 'n'},
            {'5', '0', 'v'},
            {'5', '3', 'n'},
            {'1', '0', 'n'},
            {'4', '9', 'v'},
            {'0', '7', 'n'},
            {'5', '5', 'v'},
            {'0', '8', 'v'},
            {'0', '7', 'n'},
            {'9', '3', 'v'},
            {'0', '3', 'n'},
            {'7', '7', 'v'},
            {'2', '5', 'v'},
            {'4', '2', 'v'},
            {'5', '8', 'v'},
            {'3', '4', 'v'},
            {'5', '5', 'n'},
            {'1', '0', 'v'},
            {'7', '8', 'v'},
            {'1', '9', 'n'},
            {'8', '0', 'v'},
            {'9', '4', 'v'},
            {'1', '7', 'n'},
            {'4', '4', 'n'},
            {'8', '2', 'v'},
            {'0', '6', 'n'},
            {'4', '4', 'n'},
            {'3', '0', 'n'},
        };

        final char[][] B09 = {
            {'x'},
            {'d'},
            {'y'},
            {'f'},
            {'o'},
            {'j'},
            {'u'},
            {'d'},
            {'u'},
            {'f'},
            {'u'},
            {'k'},
            {'a'},
            {'u'},
            {'q'},
            {'g'},
            {'y'},
            {'z'},
            {'y'},
            {'u'},
            {'x'},
            {'b'},
            {'u'},
            {'m'},
            {'a'},
            {'o'},
            {'z'},
            {'r'},
            {'w'},
            {'v'},
            {'x'},
            {'m'},
            {'g'},
            {'v'},
            {'u'},
            {'f'},
            {'n'},
            {'o'},
            {'y'},
        };

        final char[][] P09 = {
            {'7', '5', 'n'},
            {'8', '2', 'v'},
            {'4', '5', 'n'},
            {'0', '7', 'n'},
            {'9', '6', 'n'},
            {'7', '0', 'n'},
            {'9', '0', 'v'},
            {'4', '4', 'n'},
            {'3', '3', 'v'},
            {'1', '4', 'n'},
            {'1', '9', 'n'},
            {'6', '4', 'v'},
            {'0', '6', 'v'},
            {'1', '9', 'n'},
            {'4', '9', 'n'},
            {'3', '0', 'n'},
            {'1', '5', 'n'},
            {'7', '1', 'v'},
            {'4', '5', 'v'},
            {'9', '0', 'n'},
            {'9', '9', 'v'},
            {'0', '2', 'v'},
            {'7', '6', 'v'},
            {'8', '7', 'n'},
            {'0', '6', 'v'},
            {'5', '7', 'n'},
            {'4', '8', 'n'},
            {'0', '5', 'n'},
            {'8', '3', 'v'},
            {'6', '5', 'n'},
            {'7', '5', 'n'},
            {'8', '7', 'v'},
            {'2', '8', 'v'},
            {'1', '1', 'n'},
            {'9', '0', 'v'},
            {'0', '7', 'n'},
            {'2', '4', 'n'},
            {'3', '6', 'n'},
            {'1', '5', 'n'},
        };

        final char[][] B10 = {
            {'r'},
            {'w'},
            {'i'},
            {'m'},
            {'h'},
            {'i'},
            {'a'},
            {'p'},
            {'g'},
            {'u'},
            {'d'},
        };

        final char[][] P10 = {
            {'5', '7', 'n'},
            {'6', '1', 'n'},
            {'1', '2', 'n'},
            {'5', '2', 'v'},
            {'9', '7', 'n'},
            {'2', '2', 'n'},
            {'2', '4', 'v'},
            {'8', '4', 'n'},
            {'4', '8', 'v'},
            {'3', '5', 'v'},
            {'3', '1', 'n'},
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
