SELECT FName, LName
FROM csoderstrom.Students, csoderstrom.ScoreKeeper
WHERE ScoreKeeper.StudentID = Students.StudentID;