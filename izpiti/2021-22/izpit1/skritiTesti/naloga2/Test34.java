
import java.util.*;

public class Test34 {

    private static final boolean T = true;
    private static final boolean F = false;

    private static final boolean[][] MATRIKA1 = {
        {F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, T, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, T, T, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, T, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, T, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, T, F, F, T, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, T, F, F, F, T, F, F, F, F, F},
        {F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, T, F, F, F, F, F, F, T, F, F, F, F, F, F},
        {F, F, F, F, T, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, T, F, F},
        {F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F},
        {F, F, F, F, F, F, T, T, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F},
        {F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, T, F, F, F, F, T, F, F, F, F, F, F, T, F, F, T, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, T, F, F, F, F},
        {F, F, F, F, F, T, T, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, T, F, F, F, F, F, F, T, F, F, F, T, F, F, F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F},
        {F, F, F, F, T, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F},
        {F, F, F, F, F, T, F, F, F, F, F, T, F, T, F, F, F, F, F, F, F, F, F, T, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F},
        {F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F, F, T, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, T, F, F, F, T, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F},
        {F, F, F, F, T, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, T, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, T, F, F, F, T, F, F, T, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, T, F, F, F, T, F, T, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F},
        {F, F, T, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, T, T, F, F, F, F, F, F, F},
        {F, T, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, T, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, T, F, F, F, F, F, T, F, F, F, T, F, F, F, F, T, F, F, T, F, F, F},
        {F, F, T, F, F, T, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, T, F, T, F, F},
        {F, T, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, T, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, T, F, T, F, F, T, F, T, F, F, F, F, F, T, F, F, F, F, F, F},
        {F, F, F, F, F, T, F, F, F, F, F, F, F, T, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, T, F, F, F, F, T, F, T, F, F, F, F, T, F, F, F, T, F, F, F, F, F},
        {F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, T, T, F, F, F, F, F, F, F, F, F, F, F},
        {F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, T, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F},
        {F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, T, F, F, F, F, F, F, T, F},
        {F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, T, F, F, T, F, F, F, F, F, F, F, F, F, T, F, F, F},
    };

    private static final boolean[][] MATRIKA2 = {
        {F, F, F, F, F, F, F, T, F, T, T, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, T, F, F, F, F, F, F, F, F, F, F, F},
        {F, F, F, F, T, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F},
        {F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, T, F, F, F, F, F, F, T, F, F, F, F, T, F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, T, F, F, T, F, F, F, F, T, F, F, F, T, T, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F},
        {F, F, F, F, F, F, F, F, T, F, F, F, F, T, T, T, F, T, F, F, F, F, F, F, F, T, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, T, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, T, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, T, F, F, T, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F},
        {F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, T, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, T, F, F, F, F, T, F, F, T, F, F, F, F, F, T, F, F, F, F, F, T, F, F, F, F, F, F, F},
        {F, T, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, T, F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, T, T, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, T, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, T, F, T, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F},
        {F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, T, F, T, F, F, T, F, F, T, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, T, F, F, F},
        {F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, T, F, T, F, F, F, F, F, F, F, T, F, F, T, F, F, F, F, F, F, F, T, F, F, F, F, T, T, T, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, T, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, T, F, T, F, F, F, T, F, F, T, F, F, F, F, F, F, F, F, F},
        {F, F, F, T, T, F, F, T, F, F, T, F, T, F, F, T, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, T, F, F, F, T, F, F, F, F, F, F, F, F, F, T, F, T, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F},
        {F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, T, T, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, T, F, F, F, F, F, F, F, F, T, F, F, F, F, F, T, F, F},
        {F, F, F, F, F, T, F, F, F, F, F, T, F, F, F, F, F, T, F, F, T, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F},
        {F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, T, F, F, F, T, F, F, F, F, F},
        {F, F, F, F, F, F, F, T, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, T, F, F, F, F, F, F},
        {F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F, F, T, F, T, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F},
        {F, F, F, T, F, F, T, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, T, F, F, T, T, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, T, F, F, F, F, F, F, F, F},
        {F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, T, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, T, T, F, F, F, T, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F},
        {F, F, F, T, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, T, F, F, F, T, F, F, F, F, F, F, T, F, F, T, T, F, F, F, F},
        {F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F},
        {F, T, F, F, F, F, T, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F},
    };

    private static final boolean[][] MATRIKA3 = {
        {F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, T, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, T, F, F, F, F, F, F, T, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F},
        {F, F, T, F, F, F, F, F, F, F, F, T, F, T, F, T, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, T, T, F, F, F, F, F, F, F},
        {F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, T, F, F, T, F, F, T, F, F, F, F, F, F, F, F, T, F, T, T, F, F, F, F, T, F, F, F, T, F, F, F, F, F, F, F, F, F},
        {F, F, T, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, T, F, F, T, F, F, F, F, F, F, F, T, F, F, F, F, T, F, F, F, F, F, F, T, F, F, F, F, F, F, F},
        {F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F},
        {F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, T, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, T, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, T, F, F, F, F, F, F, F, F, F, F, F},
        {F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, T, F},
        {F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, T, F, F, T, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, T, F, F, F, F, F, T, T, F, F, F, T, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, T, F, F},
        {F, F, F, F, T, F, T, F, F, T, F, F, F, F, F, F, F, F, F, F, T, F, F, F, T, F, F, F, F, F, F, F, F, T, F, F, T, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F},
        {F, T, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, T, F, F, T, F, F, F, F, F, F, F, F, T, F, T, F, F, F, T, F, F, F, F, F, F, F, F, F, T, F, F, F, T, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F, F, F, T, T, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, T, F, F, F, T, F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, T, F, F, F, F},
        {F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F},
        {F, F, F, F, F, F, T, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, T, F, F, F, F, F, F, T, T, F, F, F, T, T, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, T, F, F, F, F, F, T, F},
        {F, F, F, T, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, T, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F},
        {F, F, F, F, F, T, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, T, T, T, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, T, F},
        {F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, T, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, T, F, F, F, F, F, F, F, T, T, F, F, F, T, F, F, F, T, F, F, F, F, F, F, F, F, F, F, T, F, F, F},
        {F, F, F, F, F, F, F, F, T, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, T, F, F, F, T, F, F, T, F, F, F, F},
        {F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, T, F, F, F, F, F, T, F, F, F, F, T, F, F, T, T, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F},
        {F, F, F, T, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, T, T, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, T, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, T, F, F},
        {F, F, F, T, F, F, T, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F},
        {F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, T, T, F, F, F, T, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F},
        {F, F, F, F, F, F, F, T, F, F, F, F, T, F, F, F, F, F, F, F, T, F, F, F, F, F, F, T, F, F, F, T, F, F, F, F, F, F, F, F, F, T, F, F, F, T, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F},
        {F, F, T, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, T, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F, F},
    };

    public static void main(String[] args) {
        System.out.println(Druga.potZoge(42, MATRIKA1, -1));
        System.out.println(Druga.potZoge(17, MATRIKA2, -1));
        System.out.println(Druga.potZoge(60, MATRIKA3, -1));
    }
}
