/* Generated By:JavaCC: Do not edit this line. MCompilerTokenManager.java */
package edu.casetools.mreasoner.compiler.realtime;

/** Token Manager. */
@SuppressWarnings("all")
public class MCompilerTokenManager implements MCompilerConstants
{
static int commentNesting=0;

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x21000000L) != 0L)
            return 0;
         if ((active0 & 0x800040L) != 0L)
            return 4;
         if ((active0 & 0x1fcfffc0000000L) != 0L)
         {
            jjmatchedKind = 27;
            return -1;
         }
         return -1;
      case 1:
         if ((active0 & 0x1fcfffc0000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 27;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 2:
         if ((active0 & 0x1fcfff80000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 27;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 3:
         if ((active0 & 0x1fcffe80000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 27;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 4:
         if ((active0 & 0x1fc3fe80000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 27;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 5:
         if ((active0 & 0x1fc2fe80000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 27;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 6:
         if ((active0 & 0xb82fe80000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 27;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 7:
         if ((active0 & 0xb027e00000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 27;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 8:
         if ((active0 & 0x1007c00000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 27;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 9:
         if ((active0 & 0x7c00000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 27;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 10:
         if ((active0 & 0x5c00000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 27;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 11:
         if ((active0 & 0x5400000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 27;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 12:
         if ((active0 & 0x5400000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 27;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 13:
         if ((active0 & 0x5000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 27;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 14:
         if ((active0 & 0x5000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 27;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 35:
         return jjStopAtPos(0, 11);
      case 40:
         return jjStopAtPos(0, 13);
      case 41:
         return jjStopAtPos(0, 14);
      case 44:
         return jjStopAtPos(0, 22);
      case 45:
         jjmatchedKind = 24;
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 46:
         return jjStopAtPos(0, 19);
      case 47:
         jjmatchedKind = 23;
         return jjMoveStringLiteralDfa1_0(0x40L);
      case 58:
         return jjStopAtPos(0, 21);
      case 59:
         return jjStopAtPos(0, 20);
      case 60:
         return jjMoveStringLiteralDfa1_0(0x200000000000L);
      case 91:
         jjmatchedKind = 15;
         return jjMoveStringLiteralDfa1_0(0x100000000000L);
      case 93:
         return jjStopAtPos(0, 16);
      case 94:
         return jjStopAtPos(0, 12);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x1e00000000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x4000000000000L);
      case 104:
         return jjMoveStringLiteralDfa1_0(0x20000000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x10100000000L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x400000000000L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x8000000000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x180c00c0000000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x2800000000000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x1006000000000L);
      case 123:
         return jjStopAtPos(0, 17);
      case 125:
         return jjStopAtPos(0, 18);
      default :
         return jjMoveNfa_0(3, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 42:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(1, 6);
         break;
      case 45:
         return jjMoveStringLiteralDfa2_0(active0, 0x300000000000L);
      case 46:
         if ((active0 & 0x40000000L) != 0L)
            return jjStopAtPos(1, 30);
         break;
      case 62:
         if ((active0 & 0x20000000L) != 0L)
            return jjStopAtPos(1, 29);
         break;
      case 69:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000000L);
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x8001800000000L);
      case 99:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x1006000000000L);
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000000000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x600000000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x420000000000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000000000L);
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x40100000000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x10800000000000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 40:
         if ((active0 & 0x100000000L) != 0L)
            return jjStopAtPos(2, 32);
         break;
      case 62:
         if ((active0 & 0x200000000000L) != 0L)
            return jjStopAtPos(2, 45);
         break;
      case 93:
         if ((active0 & 0x100000000000L) != 0L)
            return jjStopAtPos(2, 44);
         break;
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000L);
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000000L);
      case 100:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000000000L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x806000000000L);
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000000000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x21800000000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x10400000000000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x600000000L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0xc0000000000L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000000000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 40:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStopAtPos(3, 42);
         else if ((active0 & 0x80000000000L) != 0L)
            return jjStopAtPos(3, 43);
         break;
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x600000000L);
      case 100:
         return jjMoveStringLiteralDfa4_0(active0, 0x14420000000000L);
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x1800000000L);
      case 107:
         return jjMoveStringLiteralDfa4_0(active0, 0x6000000000L);
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000000000000L);
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x2010000000000L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000000000L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x8008000000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 40:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStopAtPos(4, 40);
         break;
      case 68:
         return jjMoveStringLiteralDfa5_0(active0, 0x6000000000L);
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x14400000000000L);
      case 100:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000000000L);
      case 101:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000080000000L);
      case 107:
         return jjMoveStringLiteralDfa5_0(active0, 0x600000000L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x1800000000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x8008000000000L);
      case 115:
         return jjMoveStringLiteralDfa5_0(active0, 0x2020000000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa6_0(active0, 0x20200000000L);
      case 66:
         return jjMoveStringLiteralDfa6_0(active0, 0x400000000L);
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x806000000000L);
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0xa001800000000L);
      case 115:
         return jjMoveStringLiteralDfa6_0(active0, 0x1008080000000L);
      case 121:
         if ((active0 & 0x400000000000L) != 0L)
            return jjStopAtPos(5, 46);
         else if ((active0 & 0x4000000000000L) != 0L)
            return jjStopAtPos(5, 50);
         else if ((active0 & 0x10000000000000L) != 0L)
            return jjStopAtPos(5, 52);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 40:
         if ((active0 & 0x80000000L) != 0L)
            return jjStopAtPos(6, 31);
         else if ((active0 & 0x8000000000L) != 0L)
            return jjStopAtPos(6, 39);
         break;
      case 97:
         return jjMoveStringLiteralDfa7_0(active0, 0xa001800000000L);
      case 100:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000000000000L);
      case 101:
         return jjMoveStringLiteralDfa7_0(active0, 0x400000000L);
      case 116:
         return jjMoveStringLiteralDfa7_0(active0, 0x20200000000L);
      case 121:
         if ((active0 & 0x800000000000L) != 0L)
            return jjStopAtPos(6, 47);
         return jjMoveStringLiteralDfa7_0(active0, 0x6000000000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 40:
         if ((active0 & 0x200000000L) != 0L)
            return jjStopAtPos(7, 33);
         else if ((active0 & 0x20000000000L) != 0L)
            return jjStopAtPos(7, 41);
         break;
      case 65:
         return jjMoveStringLiteralDfa8_0(active0, 0x2000000000L);
      case 66:
         return jjMoveStringLiteralDfa8_0(active0, 0x4000000000L);
      case 97:
         return jjMoveStringLiteralDfa8_0(active0, 0x1000000000000L);
      case 114:
         return jjMoveStringLiteralDfa8_0(active0, 0x1800000000L);
      case 116:
         return jjMoveStringLiteralDfa8_0(active0, 0x400000000L);
      case 121:
         if ((active0 & 0x2000000000000L) != 0L)
            return jjStopAtPos(7, 49);
         else if ((active0 & 0x8000000000000L) != 0L)
            return jjStopAtPos(7, 51);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa9_0(active0, 0x800000000L);
      case 66:
         return jjMoveStringLiteralDfa9_0(active0, 0x1000000000L);
      case 101:
         return jjMoveStringLiteralDfa9_0(active0, 0x4000000000L);
      case 116:
         return jjMoveStringLiteralDfa9_0(active0, 0x2000000000L);
      case 119:
         return jjMoveStringLiteralDfa9_0(active0, 0x400000000L);
      case 121:
         if ((active0 & 0x1000000000000L) != 0L)
            return jjStopAtPos(8, 48);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 40:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(9, 37);
         break;
      case 101:
         return jjMoveStringLiteralDfa10_0(active0, 0x1400000000L);
      case 116:
         return jjMoveStringLiteralDfa10_0(active0, 0x4800000000L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 40:
         if ((active0 & 0x800000000L) != 0L)
            return jjStopAtPos(10, 35);
         break;
      case 101:
         return jjMoveStringLiteralDfa11_0(active0, 0x400000000L);
      case 116:
         return jjMoveStringLiteralDfa11_0(active0, 0x1000000000L);
      case 119:
         return jjMoveStringLiteralDfa11_0(active0, 0x4000000000L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
private int jjMoveStringLiteralDfa11_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0);
      return 11;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa12_0(active0, 0x4000000000L);
      case 110:
         return jjMoveStringLiteralDfa12_0(active0, 0x400000000L);
      case 119:
         return jjMoveStringLiteralDfa12_0(active0, 0x1000000000L);
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
private int jjMoveStringLiteralDfa12_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(10, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(11, active0);
      return 12;
   }
   switch(curChar)
   {
      case 40:
         if ((active0 & 0x400000000L) != 0L)
            return jjStopAtPos(12, 34);
         break;
      case 101:
         return jjMoveStringLiteralDfa13_0(active0, 0x5000000000L);
      default :
         break;
   }
   return jjStartNfa_0(11, active0);
}
private int jjMoveStringLiteralDfa13_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(11, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(12, active0);
      return 13;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa14_0(active0, 0x1000000000L);
      case 110:
         return jjMoveStringLiteralDfa14_0(active0, 0x4000000000L);
      default :
         break;
   }
   return jjStartNfa_0(12, active0);
}
private int jjMoveStringLiteralDfa14_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(12, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(13, active0);
      return 14;
   }
   switch(curChar)
   {
      case 40:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStopAtPos(14, 38);
         break;
      case 110:
         return jjMoveStringLiteralDfa15_0(active0, 0x1000000000L);
      default :
         break;
   }
   return jjStartNfa_0(13, active0);
}
private int jjMoveStringLiteralDfa15_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(13, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(14, active0);
      return 15;
   }
   switch(curChar)
   {
      case 40:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStopAtPos(15, 36);
         break;
      default :
         break;
   }
   return jjStartNfa_0(14, active0);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 12;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 26)
                        kind = 26;
                  }
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 4;
                  else if (curChar == 45)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 0:
                  if (curChar == 45)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 1:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 2:
                  if ((0x2400L & l) != 0L && kind > 5)
                     kind = 5;
                  break;
               case 4:
                  if (curChar == 47)
                     jjCheckNAddTwoStates(5, 6);
                  break;
               case 5:
                  if ((0xfffffffffffffbffL & l) != 0L)
                     jjCheckNAddTwoStates(5, 6);
                  break;
               case 6:
                  if (curChar == 10 && kind > 10)
                     kind = 10;
                  break;
               case 7:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) != 0L && kind > 26)
                     kind = 26;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if ((0x7fffffeL & l) != 0L)
                  {
                     if (kind > 28)
                        kind = 28;
                  }
                  else if ((0x7fffffe00000000L & l) != 0L)
                  {
                     if (kind > 27)
                        kind = 27;
                  }
                  else if (curChar == 95)
                  {
                     if (kind > 25)
                        kind = 25;
                  }
                  break;
               case 1:
                  jjAddStates(0, 1);
                  break;
               case 5:
                  jjAddStates(2, 3);
                  break;
               case 8:
                  if (curChar == 95 && kind > 25)
                     kind = 25;
                  break;
               case 10:
                  if ((0x7fffffe00000000L & l) != 0L && kind > 27)
                     kind = 27;
                  break;
               case 11:
                  if ((0x7fffffeL & l) != 0L && kind > 28)
                     kind = 28;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(0, 1);
                  break;
               case 5:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(2, 3);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 12 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_1(0x100L);
      case 47:
         return jjMoveStringLiteralDfa1_1(0x80L);
      default :
         return 1;
   }
}
private int jjMoveStringLiteralDfa1_1(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 42:
         if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(1, 7);
         break;
      case 47:
         if ((active0 & 0x100L) != 0L)
            return jjStopAtPos(1, 8);
         break;
      default :
         return 2;
   }
   return 2;
}
static final int[] jjnextStates = {
   1, 2, 5, 6, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, "\43", "\136", 
"\50", "\51", "\133", "\135", "\173", "\175", "\56", "\73", "\72", "\54", "\57", 
"\55", null, null, null, null, "\55\76", "\163\56", "\163\164\141\164\145\163\50", 
"\151\163\50", "\143\154\157\143\153\101\164\50", 
"\143\154\157\143\153\102\145\164\167\145\145\156\50", "\143\141\154\145\156\144\141\162\101\164\50", 
"\143\141\154\145\156\144\141\162\102\145\164\167\145\145\156\50", "\167\145\145\153\104\141\171\101\164\50", 
"\167\145\145\153\104\141\171\102\145\164\167\145\145\156\50", "\157\143\143\165\162\163\50", "\151\156\147\162\50", 
"\150\157\154\144\163\101\164\50", "\163\163\162\50", "\163\105\162\50", "\133\55\135", "\74\55\76", 
"\155\157\156\144\141\171", "\164\165\145\163\144\141\171", "\167\145\144\156\145\163\144\141\171", 
"\164\150\165\162\163\144\141\171", "\146\162\151\144\141\171", "\163\141\164\165\162\144\141\171", 
"\163\165\156\144\141\171", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "IN_COMMENT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x1ffffffffff801L, 
};
static final long[] jjtoSkip = {
   0x7feL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[12];
private final int[] jjstateSet = new int[24];
private final StringBuilder jjimage = new StringBuilder();
private StringBuilder image = jjimage;
private int jjimageLen;
private int lengthOfMatch;
protected char curChar;
/** Constructor. */
public MCompilerTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public MCompilerTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 12; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 2 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   switch(curLexState)
   {
     case 0:
       try { input_stream.backup(0);
          while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
             curChar = input_stream.BeginToken();
       }
       catch (java.io.IOException e1) { continue EOFLoop; }
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_0();
       break;
     case 1:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_1();
       if (jjmatchedPos == 0 && jjmatchedKind > 9)
       {
          jjmatchedKind = 9;
       }
       break;
   }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
           TokenLexicalActions(matchedToken);
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else
        {
           SkipLexicalActions(null);
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 6 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
       commentNesting++;
         break;
      case 7 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
       commentNesting++;
         break;
      case 8 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
         commentNesting--;
if (commentNesting == 0)
SwitchTo(DEFAULT);
         break;
      default :
         break;
   }
}
void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 35 :
        image.append(jjstrLiteralImages[35]);
        lengthOfMatch = jjstrLiteralImages[35].length();
                                             System.out.println("WARNING (Line:"+input_stream.line+",Column:"+input_stream.column+"): The abuse of the internal state "+image+") could lead to system inefficiency.");
         break;
      case 36 :
        image.append(jjstrLiteralImages[36]);
        lengthOfMatch = jjstrLiteralImages[36].length();
                                                       System.out.println("WARNING(Line:"+input_stream.line+",Column:"+input_stream.column+"): The abuse of the internal state "+image+") could lead to system inefficiency.");
         break;
      case 37 :
        image.append(jjstrLiteralImages[37]);
        lengthOfMatch = jjstrLiteralImages[37].length();
                                           System.out.println("WARNING(Line:"+input_stream.line+",Column:"+input_stream.column+"): The abuse of the internal state "+image+") could lead to system inefficiency.");
         break;
      case 38 :
        image.append(jjstrLiteralImages[38]);
        lengthOfMatch = jjstrLiteralImages[38].length();
                                                     System.out.println("WARNING(Line:"+input_stream.line+",Column:"+input_stream.column+"): The abuse of the internal state "+image+") could lead to system inefficiency.");
         break;
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}
