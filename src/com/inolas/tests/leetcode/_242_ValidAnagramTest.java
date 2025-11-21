package com.inolas.tests.leetcode;

import com.inolas.solutions.leetcode._242_ValidAnagram;
import org.junit.Assert;
import org.junit.Test;

public class _242_ValidAnagramTest
{
  _242_ValidAnagram test = new _242_ValidAnagram();

  @Test
  public void isAnagramTest() {
    Assert.assertTrue(test.isAnagram("act", "cat", 1));
    Assert.assertTrue(test.isAnagram("anagram", "nagaram", 1));
  }

  @Test
  public void isNotAnagramTest() {
    Assert.assertFalse(test.isAnagram("rat", "cat", 1));
    Assert.assertFalse(test.isAnagram("fact", "cat", 1));
  }
}