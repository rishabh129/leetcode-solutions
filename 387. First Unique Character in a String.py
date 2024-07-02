class Solution:
    def firstUniqChar(self, s: str) -> int:
        for i in range(len(s)):
            if s[i] not in s[0:i]+s[i+1:]:
                return i;
        return -1